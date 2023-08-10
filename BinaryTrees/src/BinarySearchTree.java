public class BinarySearchTree {
    TreeNode root = null;
    public BinarySearchTree(TreeNode root){
        this.root = root;
    }

    public TreeNode searchElementInBST(int val){
        
        TreeNode tempRoot = root;
        if(tempRoot == null){
            return null;
        }
        while(tempRoot != null){
            if(tempRoot.val > val){
                tempRoot = tempRoot.left;
            }
            else if(tempRoot.val < val) {
                tempRoot = tempRoot.right;
            }
            else if(tempRoot.val == val){
                return tempRoot;
            }
        }
        return null;
    }
}
