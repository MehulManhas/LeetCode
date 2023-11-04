public class WaysToFormMaxHeap {
    int mod = (int) Math.pow(10,9)+7;
    public int solve(int A) {
        return (int) ways(A) % mod;
    }

    public long ways(int n){
        if(n == 1 || n == 2){
            return 1;
        }
        if(n == 3){
            return 2;
        }

        int height = (int) (Math.log(n)/Math.log(2));

        int left = findLeftSubtreeCount(n, height);
        int right = n-1-left;

        return (findNCR(n-1, left)%mod * ways(left)%mod * ways(right)%mod)%mod;

    }

    public int findLeftSubtreeCount(int n, int height){

        int nodesExceptLastLevel = (1<<height)-1;
        int nodesInLastLevel = n-nodesExceptLastLevel;

        int leftNodesCountExceptLastLevel = (nodesExceptLastLevel-1)/2;
        int leftNodesCountAtLastLevel = Math.min((1<<height)/2, nodesInLastLevel);

        return leftNodesCountExceptLastLevel + leftNodesCountAtLastLevel;
    }

    public int findNCR(int N, int K){

        if(N==K){
            return 1;
        }

        int[][] combinations = new int[N+1][K+1];

        for(int i=0; i<=N; i++){
            for(int j=0; j<= Math.min(i, K); j++){
                if(j==0 || j==i){
                    combinations[i][j] = 1;
                }
                else{
                    combinations[i][j] = (combinations[i-1][j-1] + combinations[i-1][j])%mod;
                }
            }
        }
        return combinations[N][K]%mod;
    }

}
