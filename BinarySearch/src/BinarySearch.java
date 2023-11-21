public class BinarySearch {

    public int solve(int[] A, int target){
        int start = 0;
        int end = A.length-1;

        return find(A, start, end, target);
    }

    private int find(int[] A, int start, int end, int target){

        while (start <= end){
            int mid = start + (end-start)/2;

            if(A[mid] == target){
                return mid;
            }
            else if(A[mid] < target){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }

        return -1;
    }

}
