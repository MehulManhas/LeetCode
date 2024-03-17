import java.util.Arrays;

public class HouseRobber {
    public int robWithRecursionMemoization(int[] nums) {
        int[] memo = new int[100];

        Arrays.fill(memo, -1);

        return robHouse(0, nums, memo);
    }

    private int robHouse(int i, int[] nums, int[] memo){
        if(i >= nums.length){
            return 0;
        }

        if(memo[i] != -1){
            return memo[i];
        }

        int ans = Math.max(robHouse(i+1, nums, memo), robHouse(i+2, nums, memo)+nums[i]);

        memo[i] = ans;

        return ans;
    }

    public int robTabulation(int[] nums) {
        int N = nums.length;
        int[] maxAmount = new int[nums.length+1];
        maxAmount[N] = 0;
        maxAmount[N-1] = nums[nums.length-1];

        for(int i=nums.length-2; i>=0; i--){
            maxAmount[i] = Math.max(maxAmount[i+1], maxAmount[i+2] + nums[i]);
        }

        return maxAmount[0];
    }
}
