import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LeftAndRightViewOfBinaryTree {

    public void leftViewOfBinaryTree(TreeNode root){
        ArrayList<ArrayList<Integer>> ansArray = levelOrderTraversal(root);

        ArrayList<Integer> leftView = getLeftView(ansArray);

        printArray(leftView);

        ArrayList<Integer> rightView = getRightView(ansArray);

        printArray(rightView);
    }

    public void printArray(ArrayList<Integer> viewArray){

        for(Integer integer : viewArray){
            System.out.print(integer + " ");
        }
    }
    public ArrayList<Integer> getLeftView(ArrayList<ArrayList<Integer>> ansArray){
        ArrayList<Integer> leftViewArray = new ArrayList<>();

        for (ArrayList<Integer> integers : ansArray) {
            leftViewArray.add(integers.get(0));
        }
        return leftViewArray;
    }

    public ArrayList<Integer> getRightView(ArrayList<ArrayList<Integer>> ansArray){
        ArrayList<Integer> rightViewArray = new ArrayList<>();

        for (ArrayList<Integer> integers : ansArray) {
            int innerArraySize = integers.size();
            rightViewArray.add(integers.get(innerArraySize - 1));
        }
        return rightViewArray;
    }

    public ArrayList<ArrayList<Integer>> levelOrderTraversal(TreeNode root){

        ArrayList<ArrayList<Integer>> levelOrderTraversalOutput = new ArrayList<>();
        Queue<TreeNode> nodeQueue = new LinkedList<>();

        if(root != null){
            nodeQueue.add(root);
        }
        else{
            return new ArrayList<>();
        }


        while(!nodeQueue.isEmpty()){
            int queueSize = nodeQueue.size();
            ArrayList<Integer> currentLevel = new ArrayList<>();

            for(int i=0; i<queueSize; i++){

                TreeNode temp = nodeQueue.peek();
                nodeQueue.poll();

                if(temp.left != null){
                    nodeQueue.add(temp.left);
                }

                if(temp.right != null){
                    nodeQueue.add(temp.right);
                }
                currentLevel.add(temp.val);
            }
            levelOrderTraversalOutput.add(currentLevel);
        }

        return levelOrderTraversalOutput;
    }
}

