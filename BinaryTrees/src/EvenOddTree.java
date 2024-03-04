import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class EvenOddTree {
    public boolean isEvenOddTree(TreeNode root) {
        ArrayList<ArrayList<Integer>> levelOrderTraversalOutput = levelOrderTraversal(root);

        return checkLevels(levelOrderTraversalOutput);
    }
    private ArrayList<ArrayList<Integer>> levelOrderTraversal(TreeNode root){
        ArrayList<ArrayList<Integer>> levelOrderTraversalOutput = new ArrayList<>();
        Queue<TreeNode> nodeQueue = new LinkedList<>();
        nodeQueue.add(root);

        while(!nodeQueue.isEmpty()){
            ArrayList<Integer> currentLevel = new ArrayList<>();
            int queueSize = nodeQueue.size();

            for(int i=0; i<queueSize; i++){
                TreeNode currentNode = nodeQueue.poll();

                if(currentNode == null){
                    continue;
                }

                if(currentNode.left != null){
                    nodeQueue.add(currentNode.left);
                }

                if(currentNode.right != null){
                    nodeQueue.add(currentNode.right);
                }

                currentLevel.add(currentNode.val);
            }

            levelOrderTraversalOutput.add(currentLevel);
        }

        return levelOrderTraversalOutput;
    }
    private boolean checkLevels(ArrayList<ArrayList<Integer>> levelOrderTraversalOutput){
        int level = 0;

        for(ArrayList<Integer> currentLevel : levelOrderTraversalOutput){
            if(level%2==0){
                int maxValue = Integer.MIN_VALUE;
                for(Integer nodeVal : currentLevel){
                    if(nodeVal%2 != 0 && nodeVal > maxValue){
                        maxValue = nodeVal;
                        continue;
                    }
                    else{
                        return false;
                    }
                }
            }
            else{
                int minValue = Integer.MAX_VALUE;
                for(Integer nodeVal : currentLevel){
                    if(nodeVal%2 == 0 && nodeVal < minValue){
                        minValue = nodeVal;
                        continue;
                    }
                    else{
                        return false;
                    }
                }
            }
            level++;
        }
        return true;
    }
}
