import java.util.*;

public class BinaryTreeZigzagLevelOrderTraversalLeetCode {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root == null){
            return new ArrayList<>();
        }
        List<List<Integer>> levelOrderTraversal = new ArrayList<>();

        Queue<TreeNode> nodeQueue = new LinkedList<>();
        nodeQueue.add(root);

        int level = 0;

        while (!nodeQueue.isEmpty()){
            int queueSize = nodeQueue.size();
            List<Integer> currentLevel = new ArrayList<>();
            level++;

            for(int i=0; i<queueSize; i++){

                TreeNode currentNode = nodeQueue.poll();
                if(currentNode != null){
                    currentLevel.add(currentNode.val);

                    if(currentNode.left != null){
                        nodeQueue.add(currentNode.left);
                    }

                    if(currentNode.right != null){
                        nodeQueue.add(currentNode.right);
                    }
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
