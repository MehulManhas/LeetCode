import java.util.ArrayList;
import java.util.List;

public class FindAllTheLonelyNodes {
    List<Integer> ans = new ArrayList<>();
    public List<Integer> getLonelyNodes(TreeNode root) {

        if(root == null){
            return ans;
        }

        preOrderTraversal(root, root.left);
        preOrderTraversal(root, root.right);

        return ans;
    }

    public void preOrderTraversal(TreeNode parent, TreeNode child){
        if(parent == null || child == null){
            return;
        }

        if((parent.left == null && parent.right == child) || (parent.right == null && parent.left == child)){
            ans.add(child.val);
        }

        preOrderTraversal(child, child.left);
        preOrderTraversal(child, child.right);
    }
}
