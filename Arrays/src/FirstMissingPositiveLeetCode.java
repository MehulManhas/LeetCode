public class FirstMissingPositiveLeetCode {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        boolean isOnePresent = false;

        for(int i : nums){
            if(i == 1){
                isOnePresent = true;
                break;
            }
        }

        if(!isOnePresent){
            return 1;
        }

        for(int i=0; i<nums.length; i++){
            if(nums[i] > n || nums[i] <= 0){
                nums[i] = 1;
            }
        }

        for(int i=0; i<n; i++){
            int element = Math.abs(nums[i]);

            if(element == n){
                nums[0] =- Math.abs(nums[0]);
            }
            else{
                nums[element] =- Math.abs(nums[element]);
            }
        }

        for(int i=1; i<n; i++){
            if(nums[i] > 0){
                return i;
            }
        }

        if(nums[0] > 0){
            return n;
        }

        return n+1;
    }
}
