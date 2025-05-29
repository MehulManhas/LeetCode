//Question Link: https://leetcode.com/problems/jump-game/description/?envType=study-plan-v2&envId=top-interview-150
enum Index {
    GOOD,
    BAD,
    UNKNOWN,
}
public class JumpGame {
    Index[] memo;
    public boolean canJumpSolutionOne(int[] nums) {
        memo = new Index[nums.length];

        for(int i=0; i<memo.length; i++){
            memo[i] = Index.UNKNOWN;
        }

        memo[memo.length-1] = Index.GOOD;
        return canJumpFromPosition(0, nums);

    }
    public boolean canJumpFromPosition(int position, int[] nums) {
        if (memo[position] != Index.UNKNOWN) {
            return memo[position] == Index.GOOD ? true : false;
        }

        int furthestJump = Math.min(position + nums[position], nums.length - 1);
        for (
                int nextPoistion = position + 1;
                nextPoistion <= furthestJump;
                nextPoistion++
        ) {
            if (canJumpFromPosition(nextPoistion, nums)) {
                memo[position] = Index.GOOD;
                return true;
            }
        }

        memo[position] = Index.BAD;
        return false;
    }
    public boolean canJumpSolutionTwo(int[] nums) {
        int lastPos = nums.length - 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (i + nums[i] >= lastPos) {
                lastPos = i;
            }
        }
        return lastPos == 0;
    }
}
