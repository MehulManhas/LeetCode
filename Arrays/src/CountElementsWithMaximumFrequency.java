//https://leetcode.com/problems/count-elements-with-maximum-frequency/?envType=daily-question&envId=2024-03-08
public class CountElementsWithMaximumFrequency {
    public int maxFrequencyElements(int[] nums) {
        int maxFrequency = 0;
        int ans = 0;
        int[] freqArray = new int[101];

        for(int i=0; i<nums.length; i++){
            freqArray[nums[i]]++;
            maxFrequency = Math.max(maxFrequency, freqArray[nums[i]]);
        }

        for(int i=0; i<freqArray.length; i++){
            if(freqArray[i] == maxFrequency){
                ans += freqArray[i];
            }
        }

        return ans;
    }
}
