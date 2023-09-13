//https://www.scaler.com/academy/mentee-dashboard/class/40038/homework/problems/222/?navref=cl_pb_nv_tb

import java.util.ArrayList;

public class PreorderTraversal {

    public PreorderTraversal(){

    }

    public ArrayList<Integer> preorderTraversal(TreeNode A) {

        ArrayList<Integer> ans = new ArrayList<>();

        traverse(A, ans);

        return ans;
    }

    public void traverse(TreeNode A, ArrayList<Integer> ans){

        if(A == null){
            return;
        }

        ans.add(A.val);
        traverse(A.left, ans);
        traverse(A.right, ans);
    }
}
