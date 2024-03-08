import java.util.*;

public class ZigZagLevelOrderTraversalBT {
    public ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode A) {

        ArrayList<ArrayList<Integer>> levelOrderTraversal = new ArrayList<>();

        Queue<TreeNode> nodeQueue = new LinkedList<>();
        nodeQueue.add(A);

        int level = 0;

        while (!nodeQueue.isEmpty()){
            int queueSize = nodeQueue.size();
            ArrayList<Integer> currentLevel = new ArrayList<>();
            level++;

            for(int i=0; i<queueSize; i++){

                TreeNode currentNode = nodeQueue.poll();

                currentLevel.add(currentNode.val);

                if(currentNode.left != null){
                    nodeQueue.add(currentNode.left);
                }

                if(currentNode.right != null){
                    nodeQueue.add(currentNode.right);
                }
            }

            if(level%2 == 0){
                Collections.reverse(currentLevel);
            }

            levelOrderTraversal.add(currentLevel);
        }

        return levelOrderTraversal;
    }
}
