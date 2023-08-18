public class MatrixSearch {

    public MatrixSearch(){}

    public int searchMatrix(int[][] A, int B) {
        int rowNumber = getSearchRow(A, B);

        if(rowNumber == -1){
            return 0;
        }

        return binarySearchInRow(A[rowNumber], B);

    }

    public int getSearchRow(int[][] A, int B){

        for(int i=0; i<A.length; i++){
            if(A[i][0] <= B && A[i][A[i].length-1] >= B){
                return i;
            }
        }

        return -1;
    }

    public int binarySearchInRow(int[] row, int B){

        int left = 0;
        int right = row.length-1;


        while(left<=right){
            int mid = left + (right - left)/2;

            if(row[mid] == B){
                return 1;
            }
            else if(row[mid] < B){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return 0;
    }
}
