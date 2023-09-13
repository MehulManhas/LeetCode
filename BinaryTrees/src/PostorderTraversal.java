import java.util.ArrayList;

public class PostorderTraversal {

    public PostorderTraversal(){}

    public ArrayList<Integer> postorderTraversal(TreeNode A) {

        ArrayList<Integer> ans = new ArrayList<>();

        traverse(A, ans);

        return ans;
    }

    public void traverse(TreeNode A, ArrayList<Integer> ans){

        if(A == null){
            return;
        }

        traverse(A.left, ans);
        traverse(A.right, ans);
        ans.add(A.val);
    }
}
