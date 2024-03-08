public class FindPeakElement {
    public int findPeakElement(int[] nums) {
        int len = nums.length;
        if(len==1 || nums[0]>nums[1]) {
            return 0;
        }
        if(nums[len-1]>nums[len-2]) {
            return len-1;
        }
        int l = 0;
        int h = len-1;
        int mid;
        while(l<=h) {
            mid = (l+h)/2;
            if(nums[mid]>nums[mid+1] && nums[mid]>nums[mid-1]) {
                return mid;
            }
            if(nums[mid] > nums[mid+1]) {
                h=mid-1;
            } else {
                l=mid+1;
            }
        }
        return 0;
    }

}
