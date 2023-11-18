public class EquilibriumIndexOfAnArray {

    public int solve(int[] A){
        int[] prefixSum = calculatePrefixArray(A);

        for(int i=0; i<prefixSum.length; i++){

            int left = 0;

            if(i>0){
                left = prefixSum[i-1];
            }

            int right = prefixSum[prefixSum.length-1] - prefixSum[i];

            if(left == right){
                return i;
            }
        }

        return -1;
    }

    public int[] calculatePrefixArray(int[] A){
        int[] prefixSum = new int[A.length];

        prefixSum[0] = A[0];

        for(int i=1; i<A.length; i++){
            prefixSum[i] = prefixSum[i-1] + A[i];
        }

        return prefixSum;
    }
}
