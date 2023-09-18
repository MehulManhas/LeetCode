public class CountSwapsInInsertionSortII {

    int swaps = 0;
    public int solve(int[] A) {

        for(int i=1; i<A.length; i++){

            for(int j=i-1; j>=0; j--){
                if(A[j] > A[j+1]){
                    swap(A, j, j+1);
                }
                else{
                    break;
                }
            }
        }

        return swaps;
    }

    public void swap(int[] A, int idx1, int idx2){
        int temp = A[idx1];
        A[idx1] = A[idx2];
        A[idx2] = temp;
        swaps++;
    }
}
