import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class OddAndEvenLevels {
    ArrayList<ArrayList<Integer>> levelOrderOutput = new ArrayList<>();
    public OddAndEvenLevels(){}

    public int solve(TreeNode A) {
        levelOrderTraversal(A);

        return findDifference();
    }

    public void levelOrderTraversal(TreeNode root){

        Queue<TreeNode> nodeQueue = new LinkedList<>();

        nodeQueue.add(root);

        while(!nodeQueue.isEmpty()){
            ArrayList<Integer> currentLevel = new ArrayList<>();

            int queueSize = nodeQueue.size();

            for(int i=0; i<queueSize; i++){

                TreeNode temp = nodeQueue.peek();
                nodeQueue.poll();

                if(temp.right != null){
                    nodeQueue.add(temp.right);
                }

                if(temp.left != null){
                    nodeQueue.add(temp.left);
                }
                currentLevel.add(temp.val);
            }

            levelOrderOutput.add(currentLevel);
        }
    }

    public int findDifference(){

        int sum = 0;

        for(int i=0; i<levelOrderOutput.size(); i++){
            for(int j : levelOrderOutput.get(i)){
                if(i%2 == 0){
                    sum += j;
                }
                else{
                    sum -= j;
                }
            }

        }

        return sum;
    }
}
