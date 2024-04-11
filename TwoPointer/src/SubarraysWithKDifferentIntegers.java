//https://leetcode.com/problems/subarrays-with-k-different-integers/description/?envType=daily-question&envId=2024-03-30
import java.util.HashMap;

public class SubarraysWithKDifferentIntegers {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return slidingWidnow(nums, k) - slidingWidnow(nums, k-1);
    }
    public int slidingWidnow(int[] nums, int k){
        HashMap<Integer, Integer> numCountMap = new HashMap<>();
        int left = 0;
        int right = 0;
        int n = nums.length;
        int countOfSubArrays = 0;

        while(right < n){
            numCountMap.put(nums[right], numCountMap.getOrDefault(nums[right], 0) +1);

            while(numCountMap.size() > k){
                numCountMap.put(nums[left], numCountMap.get(nums[left])-1);
                if(numCountMap.get(nums[left]) == 0){
                    numCountMap.remove(nums[left]);
                }
                left++;
            }
            countOfSubArrays += (right - left + 1);
            right++;
        }

        return countOfSubArrays;
    }
}
