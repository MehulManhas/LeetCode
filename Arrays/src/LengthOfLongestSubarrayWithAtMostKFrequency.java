//https://leetcode.com/problems/length-of-longest-subarray-with-at-most-k-frequency/?envType=daily-question&envId=2024-03-28
import java.util.HashMap;

public class LengthOfLongestSubarrayWithAtMostKFrequency {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer, Integer> numFreqMap = new HashMap<>();
        int left = 0;
        int right = 0;
        int maxLength = 0;

        while(left <= nums.length-1 && right <= nums.length-1){
            if(!numFreqMap.containsKey(nums[right])){
                numFreqMap.put(nums[right], 1);
                right++;
            }
            else if(numFreqMap.containsKey(nums[right])){
                int freqRight = numFreqMap.get(nums[right]);
                int freqLeft = numFreqMap.get(nums[left]);

                if(freqRight < k){
                    numFreqMap.put(nums[right], ++freqRight);
                    right++;
                }
                else if(freqRight == k){
                    if(nums[left] == nums[right]){
                        left++;
                        right++;
                    }
                    else{
                        if(numFreqMap.get(nums[right]) + 1 > k){
                            numFreqMap.put(nums[left], --freqLeft);
                            left++;
                        }
                        else{
                            numFreqMap.put(nums[right], ++freqRight);
                            right++;
                        }
                    }
                }

            }
            maxLength = Math.max(maxLength, right-left);
        }

        return maxLength;
    }
}
