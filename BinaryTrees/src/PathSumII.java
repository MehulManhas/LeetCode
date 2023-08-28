import java.util.ArrayList;
import java.util.List;

public class PathSumII {

    public PathSumII(){}

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        //System.out.println(getPathSum(root, targetSum));
        return getPathSum(root, targetSum, new ArrayList<>(), new ArrayList<>());
    }
    public List<List<Integer>> getPathSum(TreeNode root, int targetSum, List<List<Integer>> ans, List<Integer> currResult){

        if(root == null){
            return ans;
        }
        currResult.add(root.val);
        if(root.val == targetSum && root.left == null && root.right == null){
            ans.add(new ArrayList<>(currResult));
        }

        System.out.print(root.val + " ");

        getPathSum(root.left, targetSum-root.val, ans, currResult);
        getPathSum(root.right, targetSum-root.val, ans, currResult);

        currResult.remove(currResult.size()-1);

        return ans;
    }
}
