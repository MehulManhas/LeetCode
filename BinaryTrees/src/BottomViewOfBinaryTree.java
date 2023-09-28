import java.util.*;

public class BottomViewOfBinaryTree {
    public ArrayList<Integer> solve(TreeNode A) {

        int minLevel = 0;
        int maxLevel = 0;

        HashMap<Integer, ArrayList<Integer>> nodeMap = new HashMap<>();
        Queue<Pair> nodeQueue = new LinkedList<>();
        Pair root = new Pair(A, 0);
        nodeQueue.add(root);

        while (!nodeQueue.isEmpty()){
            Pair currentPair = nodeQueue.poll();
            TreeNode currentNode = currentPair.node;
            int currentLevel = currentPair.level;

            minLevel = Math.min(minLevel, currentLevel);
            maxLevel = Math.max(maxLevel, currentLevel);

            if(!nodeMap.containsKey(currentLevel)){
                ArrayList<Integer> tempList = new ArrayList<>();
                tempList.add(currentNode.val);
                nodeMap.put(currentLevel, tempList);
            }
            else{
                ArrayList<Integer> tempList = nodeMap.get(currentLevel);
                tempList.add(currentNode.val);
                nodeMap.put(currentLevel, tempList);
            }

            if(currentNode.left != null){
                Pair tempPair = new Pair(currentNode.left, currentLevel-1);
                nodeQueue.add(tempPair);
            }

            if(currentNode.right != null){
                Pair tempPair = new Pair(currentNode.right, currentLevel+1);
                nodeQueue.add(tempPair);
            }
        }

        return getBottomView(nodeMap, minLevel, maxLevel);
    }

    public ArrayList<Integer> getBottomView(HashMap<Integer, ArrayList<Integer>> nodeMap, int minLevel, int maxLevel){

        ArrayList<Integer> bottomViewArray = new ArrayList<>();

        int itr = 0;
        for(int i=minLevel; i<=maxLevel; i++){
            ArrayList<Integer> tempList = nodeMap.get(i);
            bottomViewArray.add(itr++, tempList.get(tempList.size()-1));
        }

        return bottomViewArray;
    }

}
