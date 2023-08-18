public class SearchInBitonicArray {
    public SearchInBitonicArray(){}

    public int solve(int[] A, int B) {
        int pivotIndex = findPivotIndex(A);

        if(A[pivotIndex] == B){
            return pivotIndex;
        }
        int binSearchLR = binarySearchLeftToRight(A, B, 0, pivotIndex);
        int binSearchRL = binarySearchRightToLeft(A, B, pivotIndex+1, A.length-1);

        if(binSearchRL != -1){
            return binSearchRL;
        }
        else if(binSearchLR != -1){
            return binSearchLR;
        }

        return -1;
    }

    public int findPivotIndex(int[] A){
        int left = 1;
        int right = A.length-2;

        while(left <= right){

            int mid = left + (right - left)/2;

            if(A[mid-1] < A[mid] && A[mid] > A[mid+1]){
                return mid;
            }
            else if(A[mid-1] < A[mid] && A[mid] < A[mid+1]){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }

        return A.length-1;
    }

    public int binarySearchRightToLeft(int[] A, int B, int left, int right){

        while(left<=right){

            int mid = left + (right-left)/2;

            if(A[mid] == B){
                return mid;
            }
            else if(A[mid] > B){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }

        return -1;
    }

    public int binarySearchLeftToRight(int[] A, int B, int left, int right){

        while(left<=right){

            int mid = left + (right-left)/2;

            if(A[mid] == B){
                return mid;
            }
            else if(A[mid] < B){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }

        return -1;
    }
}
