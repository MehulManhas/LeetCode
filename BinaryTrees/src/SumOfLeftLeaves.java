//https://leetcode.com/problems/sum-of-left-leaves/description/?envType=daily-question&envId=2024-04-14
public class SumOfLeftLeaves {
    int sum = 0;
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null){
            return 0;
        }

        preOrderTraversal(root, root.left);
        preOrderTraversal(root, root.right);

        return sum;
    }

    public void preOrderTraversal(TreeNode parent, TreeNode child){
        if(parent == null || child == null){
            return;
        }

        if(parent.left == child && child.left == null && child.right == null){
            sum += child.val;
        }

        preOrderTraversal(child, child.left);
        preOrderTraversal(child, child.right);
    }
}
