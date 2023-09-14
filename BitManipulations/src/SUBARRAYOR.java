public class SUBARRAYOR {

    public int solve(int[] A) {
        int n = A.length;
        int totalSubArrays = (n*(n+1))/2;

        int ans = 0;

        for(int i=0; i<32; i++){
            int currentSubArrays = 0;
            int currentZeroCount = 0;

            for(int j=0; j<A.length; j++){

                if(!checkSetBit(A[j], i)){
                    currentZeroCount++;
                }

                if(checkSetBit(A[j], i) || j==n-1){
                    currentSubArrays += (currentZeroCount * (currentZeroCount+1))/2;
                    currentZeroCount = 0;
                }

            }

            ans += ((totalSubArrays - currentSubArrays)*(1<<i)) % 1000000007;

        }

        return ans;
    }

    public boolean checkSetBit(int num, int i){

        return ((num >> i) & 1) == 1;
    }
}
