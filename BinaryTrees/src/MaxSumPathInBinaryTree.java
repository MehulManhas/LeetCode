public class MaxSumPathInBinaryTree {
    int ans = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode A) {
        maxPathSumRoot(A);
        return ans;
    }

    public int maxPathSumRoot(TreeNode A){

        if(A == null){
            return 0;
        }

        int leftSum = Math.max(0, maxPathSumRoot(A.left));
        int rightSum = Math.max(0, maxPathSumRoot(A.right));

        ans = Math.max(ans, A.val + leftSum + rightSum);

        return Math.max(leftSum+A.val, rightSum+A.val);
    }
}
