//https://leetcode.com/problems/add-one-row-to-tree/?envType=daily-question&envId=2024-04-16
public class AddOneRowToTree {
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth == 1){
            TreeNode newRoot = new TreeNode(val);
            newRoot.left = root;
            return newRoot;
        }
        addNewRow(root, val, depth);

        return root;
    }

    public void addNewRow(TreeNode root, int val, int depth){
        if(root == null){
            return;
        }
        int currDepth = depth;
        addNewRow(root.left, val, currDepth-1);
        if(depth == 2){
            TreeNode temp = root;
            TreeNode newNode = new TreeNode(val);

            temp = temp.left;
            root.left = newNode;
            newNode.left = temp;

            temp = root;
            newNode = new TreeNode(val);

            temp = temp.right;
            root.right = newNode;
            newNode.right = temp;

        }

        addNewRow(root.right, val, currDepth-1);

    }
}
