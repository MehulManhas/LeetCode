import java.util.*;

public class LevelOrderTraversal {
    ArrayList<ArrayList<Integer>> levelOrderTraversalOutput = new ArrayList<>();
    public ArrayList levelOrderTraversal(TreeNode root){
        Queue<TreeNode> addressQueue = new LinkedList<>();

        addressQueue.add(root);

        while(addressQueue.size() > 0){

            ArrayList<Integer> currentLevel = new ArrayList<>();
            int queueSize = addressQueue.size();

            for(int i=0; i<queueSize; i++){

                TreeNode temp = addressQueue.peek();
                addressQueue.poll();

                //System.out.println(temp.val);

                if(temp.left != null){
                    addressQueue.add(temp.left);
                }

                if(temp.right != null) {
                    addressQueue.add(temp.right);
                }
                currentLevel.add(temp.val);
            }

            levelOrderTraversalOutput.add(currentLevel);
        }
        return levelOrderTraversalOutput;
    }
}
