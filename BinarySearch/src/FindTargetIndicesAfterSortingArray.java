import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindTargetIndicesAfterSortingArray {

    public FindTargetIndicesAfterSortingArray(){}


    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        int len = nums.length;
        List<Integer> ans = new ArrayList<>();
        int pos = binarySearch(nums, target);
        if(pos == -1) {
            return ans;
        }
        while(pos < len && nums[pos]==target) {
            ans.add(pos++);
        }
        return ans;
    }
    private int binarySearch(int[] nums, int target) {
        int low = 1;
        int high = nums.length-1;

        if(nums[0]==target) {
            return 0;
        }
        if(nums[0]>target || nums[high] < target) {
            return -1;
        }
        while(low<=high) {
            int mid = low+(high-low)/2;
            if(nums[mid]==target && nums[mid-1]<target) {
                return mid;
            }
            if(nums[mid]>=target) {
                high = mid-1;
            } else {
                low = mid+1;
            }
        }
        return -1;
    }
}
