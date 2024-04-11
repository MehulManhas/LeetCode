//https://leetcode.com/problems/subarray-product-less-than-k/description/?envType=daily-question&envId=2024-03-27
public class SubarrayProductLessThanK {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int len=nums.length;
        int ans=0;
        for(int i=0;i<len;i++) {
            int product=1;
            for(int j=i;j<len;j++) {
                product*=nums[j];
                if(product>=k) {
                    break;
                }
                ans++;
            }
        }
        return ans;
    }
}
