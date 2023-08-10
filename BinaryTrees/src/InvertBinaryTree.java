public class InvertBinaryTree {
    public TreeNode invertBinaryTree(TreeNode root){
        traverseAndReturn(root);
        return root;
    }

    public void traverseAndReturn(TreeNode root){

        if(root == null){
            return;
        }

        traverseAndReturn(root.left);
        traverseAndReturn(root.right);

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
    }
}
