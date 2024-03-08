public class RotatedSortedArraySearch {

    public int search(final int[] A, int B) {
        int left = 0;
        int right = A.length-1;

        while (left <= right){
            int mid = left + (right-left)/2;

            if(A[mid] == B){
                return mid;
            }
            else if(A[left] < A[mid]){
                if(B >= A[left] && B < A[mid]){
                    right = mid - 1;
                }
                else{
                    left = mid + 1;
                }
            }
            else {
                if(B > A[mid] && B <= A[right]){
                    left = mid + 1;
                }
                else {
                    right = mid -1;
                }
            }
        }

        return -1;
    }

    public int findTarget(int[] nums, int left, int right, int target){

        if(left > right){
            return -1;
        }
        int mid = (left + right)/2;

        if(nums[mid] == target){
            return mid;
        }
        if(nums[left] <= nums[mid]){
            if(target >= nums[left] && target <= nums[mid]){
                return findTarget(nums, left, mid-1, target);
            }
            return findTarget(nums, mid+1, right, target);
        }
        if(target >= nums[mid] && target <= nums[right]){
            return findTarget(nums, mid+1, right, target);
        }

        return findTarget(nums, left, mid-1, target);
    }
}
