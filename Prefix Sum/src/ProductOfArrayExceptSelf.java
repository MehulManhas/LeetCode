//https://leetcode.com/problems/product-of-array-except-self/?envType=daily-question&envId=2024-03-15
public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] ans = new int[len];
        int temp=nums[0];
        for(int i=1;i<len;i++) {
            ans[i] = temp;
            temp *= nums[i];
        }
        temp = nums[len-1];
        for(int i=len-2;i>0;i--) {
            ans[i] *= temp;
            temp *= nums[i];
        }
        ans[0] = temp;
        return ans;
    }
}
