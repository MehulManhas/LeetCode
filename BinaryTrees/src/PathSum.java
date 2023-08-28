public class PathSum {

    public PathSum(){}

    public int hasPathSum(TreeNode A, int B) {
        return preOrderTraversal(A, B);
    }

    public int preOrderTraversal(TreeNode root, int B){

        if(root == null){
            return 0;
        }

        if(root.val == B && root.left == null && root.right == null){
            return 1;
        }

        if(preOrderTraversal(root.left, B-root.val) == 1 || preOrderTraversal(root.right, B-root.val) == 1){
            return 1;
        }

        return 0;
    }
}
