public class MinimumOperationsToMakeTheArrayIncreasing {

    public MinimumOperationsToMakeTheArrayIncreasing(){}

    public int minOperations(int[] nums) {

        int minCost = 0;

        for(int i=1; i<nums.length; i++){
            if(nums[i-1] >= nums[i]){
                int diff = nums[i-1] - nums[i] + 1;
                minCost += diff;
                nums[i] += diff;
            }
        }

        return minCost;
    }
}
