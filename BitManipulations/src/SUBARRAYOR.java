public class SUBARRAYOR {

    public int solve(int[] A) {
        long n = A.length;
        long totalSubArrays = (n*(n+1))/2;

        long ans = 0;

        for(int i=0; i<32; i++){
            long currentSubArrays = 0;
            long currentZeroCount = 0;

            for(int j=0; j<A.length; j++){

                if(!checkSetBit(A[j], i)){
                    currentZeroCount++;
                }

                if(checkSetBit(A[j], i) || j==n-1){
                    currentSubArrays += (currentZeroCount * (currentZeroCount+1))/2;
                    currentZeroCount = 0;
                }

            }

            ans = (ans + ((totalSubArrays - currentSubArrays) * (int) Math.pow(2,i))) % 1000000007;

        }

        return (int) ans;
    }

    public boolean checkSetBit(int num, int i){

        if(((num>>i)&1) == 1){
            return true;
        }

        return false;

    }
}
