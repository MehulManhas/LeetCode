public class MaxNonNegativeSubArray {

    public MaxNonNegativeSubArray(){}

    public int[] maxset(int[] A) {
        int start = -1;
        int end = -1;
        long maxSum = Integer.MIN_VALUE;

        int tempStart = -1;
        int tempEnd = -1;
        long tempSum = 0;

        for(int i=0; i<A.length; i++){

            if(A[i] >= 0 && tempStart == -1){
                tempStart = i;
            }

            if(A[i] < 0 && tempEnd == -1){
                tempEnd = i-1;

                if(maxSum < tempSum){
                    maxSum = tempSum;
                    start = tempStart;
                    end = tempEnd;
                }

                tempSum = 0;
                tempEnd = -1;
                tempStart = -1;
            }

            if(A[i] >= 0 && tempStart >= 0){
                tempSum += A[i];
            }

        }

        if(tempEnd == -1 && tempSum >= 0){

            if(tempSum > maxSum){
                maxSum = tempSum;
                start = tempStart;
                end = A.length-1;
            }
        }

        if(start == -1 && end == -1){
            return new int[0];
        }

        int[] ans = new int[end-start+1];
        int itr = 0;

        for(int i=start; i<=end; i++){
            ans[itr++] =  A[i];
        }


        return ans;
    }
}
