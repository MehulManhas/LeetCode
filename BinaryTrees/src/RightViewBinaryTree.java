import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class RightViewBinaryTree {
    public ArrayList<Integer> solve(TreeNode A) {
        ArrayList<ArrayList<Integer>> levelOrderTraversal = new ArrayList<>();
        Queue<TreeNode> nodeQueue = new LinkedList<>();
        nodeQueue.add(A);

        while (!nodeQueue.isEmpty()){
            ArrayList<Integer> currentLevel = new ArrayList<>();
            int queueSize = nodeQueue.size();

            for(int i=0; i<queueSize; i++){
                TreeNode currentNode = nodeQueue.poll();

                if(currentNode.left != null){
                    nodeQueue.add(currentNode.left);
                }

                if(currentNode.right != null){
                    nodeQueue.add(currentNode.right);
                }
                currentLevel.add(currentNode.val);
            }
            levelOrderTraversal.add(currentLevel);
        }

        return getRightView(levelOrderTraversal);
    }

    public ArrayList<Integer> getRightView(ArrayList<ArrayList<Integer>> levelOrderTraversal){

        ArrayList<Integer> rightView = new ArrayList<>();
        for(ArrayList<Integer> currentList : levelOrderTraversal){
            rightView.add(currentList.get(currentList.size()-1));
        }

        return rightView;
    }

}
