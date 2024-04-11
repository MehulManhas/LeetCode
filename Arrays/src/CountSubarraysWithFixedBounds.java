//https://leetcode.com/problems/count-subarrays-with-fixed-bounds/?envType=daily-question&envId=2024-03-31
public class CountSubarraysWithFixedBounds {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        int minPos = -1;
        int maxPos = -1;
        int leftBound = -1;
        long ans = 0;

        for(int i=0; i<nums.length; i++){
            if(nums[i] < minK || nums[i] > maxK){
                leftBound = i;
            }

            if(nums[i] == minK){
                minPos = i;
            }
            if(nums[i] == maxK){
                maxPos = i;
            }

            if(Math.min(minPos, maxPos) - leftBound > 0){
                ans += Math.min(minPos, maxPos) - leftBound;
            }
        }

        return ans;
    }
}
