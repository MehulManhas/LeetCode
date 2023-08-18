public class FindAPeakElement {

    public FindAPeakElement(){}

    public int solve(int[] A) {
        return binarySearchPeakElement(A);
    }

    public int binarySearchPeakElement(int[] A){
        int left = 1;
        int right = A.length-2;

        while(left <= right){

            int mid = left + (right - left)/2;

            if(A[mid] > A[mid-1] && A[mid] > A[mid+1]){
                return A[mid];
            }
            else if(A[mid-1] < A[mid] && A[mid] < A[mid+1]){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }

        return Math.max(A[A.length - 1], A[0]);
    }
}
