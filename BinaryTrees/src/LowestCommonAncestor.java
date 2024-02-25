import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.List;

public class LowestCommonAncestor {

    public LowestCommonAncestor(){}

    public int lca(TreeNode A, int B, int C) {
        ArrayList<TreeNode> pathA = nodePathFromRoot(A, B);
        ArrayList<TreeNode> pathB = nodePathFromRoot(A, C);

        if(pathA.isEmpty() || pathB.isEmpty()){
            return -1;
        }

        int i = pathA.size()-1;
        int j = pathB.size()-1;

        while (i>=0 && j>=0 && pathA.get(i).equals(pathB.get(j))){
            i--;
            j--;
        }

        return pathA.get(i+1).val;
    }

    public ArrayList<TreeNode> nodePathFromRoot(TreeNode root, int value){
        if(root == null){
            return new ArrayList<>();
        }

        if(root.val == value){
            return new ArrayList<TreeNode>(List.of(root));
        }

        ArrayList<TreeNode> leftPath = nodePathFromRoot(root.left, value);

        if(leftPath.size() > 0){
            leftPath.add(root);
            return leftPath;
        }

        ArrayList<TreeNode> rightPath = nodePathFromRoot(root.right, value);

        if(rightPath.size() > 0){
            rightPath.add(root);
            return rightPath;
        }
        return new ArrayList<>();
    }
}
