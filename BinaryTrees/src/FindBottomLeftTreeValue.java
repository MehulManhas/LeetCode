//Question : https://leetcode.com/problems/find-bottom-left-tree-value/?envType=daily-question&envId=2024-02-28

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class FindBottomLeftTreeValue {
    public int findBottomLeftValue(TreeNode root) {

        if(root == null){
            return -1;
        }

        ArrayList<ArrayList<Integer>> levelOrderTraversal = levelOrderTraversal(root);

        return levelOrderTraversal.get(levelOrderTraversal.size()-1).get(0);
    }
    public ArrayList<ArrayList<Integer>> levelOrderTraversal(TreeNode root){
        ArrayList<ArrayList<Integer>> levelOrderTraversal = new ArrayList<>();

        Queue<TreeNode> nodeQueue = new LinkedList<>();
        nodeQueue.add(root);

        while(!nodeQueue.isEmpty()){
            ArrayList<Integer> currentLevel = new ArrayList<>();
            int queueSize = nodeQueue.size();

            for(int i=0; i<queueSize; i++){
                TreeNode temp = nodeQueue.peek();
                nodeQueue.poll();
                if(temp != null){
                    if(temp.left != null){
                        nodeQueue.add(temp.left);
                    }

                    if(temp.right != null){
                        nodeQueue.add(temp.right);
                    }
                    currentLevel.add(temp.val);
                }
            }
            levelOrderTraversal.add(currentLevel);
        }

        return levelOrderTraversal;
    }
}
