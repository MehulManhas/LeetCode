//https://leetcode.com/problems/minimum-difference-between-largest-and-smallest-value-in-three-moves/?envType=daily-question&envId=2024-07-03
import java.util.Arrays;

public class MinimumDifferenceBetweenLargestAndSmallestValueinThreeMoves {
    public int minDifference(int[] nums) {

        if(nums.length <= 4){
            return 0;
        }

        Arrays.sort(nums);

        int ans = nums[nums.length-1] - nums[0];
        int j = nums.length-3;

        for(int i=j-1; i<nums.length; i++){
            ans = Math.min(ans, nums[i] - nums[i-j+1]);
        }

        return ans;

    }
}
