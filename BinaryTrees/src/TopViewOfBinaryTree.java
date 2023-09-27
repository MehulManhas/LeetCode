import java.util.*;

public class TopViewOfBinaryTree {
    public ArrayList<Integer> solve(TreeNode A) {
        HashMap<Integer, ArrayList<Integer>> nodeMap = new HashMap<>();
        Queue<Pair> nodeQueue = new LinkedList<>();

        Pair root = new Pair(A, 0);
        nodeQueue.add(root);

        while (!nodeQueue.isEmpty()){
            Pair currentNodePair = nodeQueue.poll();

            TreeNode currentNode = currentNodePair.node;
            int currentLevel = currentNodePair.level;

            if(nodeMap.containsKey(currentLevel)){
                ArrayList<Integer> tempList = nodeMap.get(currentLevel);
                tempList.add(currentNode.val);
                nodeMap.put(currentLevel, tempList);
            }
            else{
                ArrayList<Integer> tempList = new ArrayList<>();
                tempList.add(currentNode.val);
                nodeMap.put(currentLevel, tempList);
            }

            if(currentNode.left != null){
                Pair leftNode = new Pair(currentNode.left, currentLevel-1);
                nodeQueue.add(leftNode);
            }

            if(currentNode.right != null){
                Pair rightNode = new Pair(currentNode.right, currentLevel+1);
                nodeQueue.add(rightNode);
            }
        }

        return  getTopViewNodeList(nodeMap);

    }

    public ArrayList<Integer> getTopViewNodeList(HashMap<Integer, ArrayList<Integer>> nodeMap){

        ArrayList<Integer> topView = new ArrayList<>();

        for(Map.Entry<Integer, ArrayList<Integer>> entry : nodeMap.entrySet()){

            topView.add(entry.getValue().get(0));
        }

        return topView;
    }

}
