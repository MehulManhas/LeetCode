import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ReverseLevelOrder {
    ArrayList<ArrayList<Integer>> levelOrderTraversal;
    public ReverseLevelOrder(){}

    public ArrayList<Integer> solve(TreeNode A) {

        levelOrderTraversal = new ArrayList<>();

        Queue<TreeNode> nodeQueue = new LinkedList<>();

        nodeQueue.add(A);

        while(!nodeQueue.isEmpty()){

            ArrayList<Integer> currentLevel = new ArrayList<>();

            int currentQueueSize = nodeQueue.size();

            for(int i=0; i<currentQueueSize; i++){

                TreeNode tempNode = nodeQueue.peek();
                nodeQueue.poll();

                if(tempNode.left != null){
                    nodeQueue.add(tempNode.left);
                }

                if(tempNode.right != null){
                    nodeQueue.add(tempNode.right);
                }

                currentLevel.add(tempNode.val);
            }

            levelOrderTraversal.add(currentLevel);
        }

        return flattenList(levelOrderTraversal);
    }

    public ArrayList<Integer> flattenList(ArrayList<ArrayList<Integer>> ans){

        ArrayList<Integer> flattenedList = new ArrayList<>();

        for(int i=ans.size()-1; i>=0; i--){

            flattenedList.addAll(ans.get(i));
        }

        return flattenedList;
    }
}
