public class DiameterOfBinaryTree {

    public DiameterOfBinaryTree(){}

    int diameter = Integer.MIN_VALUE;

    public int solve(TreeNode A) {
        traverseAndGetDiameter(A);
        return diameter == Integer.MIN_VALUE ? 0 : diameter;
    }

    public int traverseAndGetDiameter(TreeNode root){

        if(root == null){
            return 0;
        }

        int left = traverseAndGetDiameter(root.left);
        int right = traverseAndGetDiameter(root.right);

        diameter = Math.max(diameter, left+right);
        return Math.max(left, right) + 1;
    }
}
