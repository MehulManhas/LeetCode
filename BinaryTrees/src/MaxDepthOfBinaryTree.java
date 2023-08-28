public class MaxDepthOfBinaryTree {
    public MaxDepthOfBinaryTree(){}

    public int maxDepth(TreeNode A) {
        if(A == null){
            return 0;
        }
        int left = maxDepth(A.left);
        int right = maxDepth(A.right);
        return Math.max(Math.max(left, right), 0) + 1;
    }
}
