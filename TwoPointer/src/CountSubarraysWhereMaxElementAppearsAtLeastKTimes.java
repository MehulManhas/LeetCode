//https://leetcode.com/problems/count-subarrays-where-max-element-appears-at-least-k-times/?envType=daily-question&envId=2024-03-29
public class CountSubarraysWhereMaxElementAppearsAtLeastKTimes {
    public long countSubarrays(int[] nums, int k) {
        int countOfMaxElement = 0;
        int maxElement = findMaxElement(nums);
        int left = 0;
        int right = 0;
        long countOfSubArrays = 0;

        if(maxElement == Integer.MIN_VALUE){
            return 0;
        }

        for(;right<nums.length; right++){
            if(nums[right] == maxElement){
                countOfMaxElement++;
            }
            while(k == countOfMaxElement && left<nums.length){
                if(nums[left] == maxElement){
                    countOfMaxElement--;
                }
                left++;
            }
            countOfSubArrays += left;
        }
        return countOfSubArrays;
    }
    public int findMaxElement(int[] nums){
        int maxValue = Integer.MIN_VALUE;

        for(int i : nums){
            if(maxValue < i){
                maxValue = i;
            }
        }

        return maxValue;
    }
}
