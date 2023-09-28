import java.util.*;

public class VerticalOrderTraversal {
    public ArrayList<ArrayList<Integer>> verticalOrderTraversal(TreeNode A) {
        int minLevel = 0;
        int maxLevel = 0;

        HashMap<Integer, ArrayList<Integer>> nodeMap = new HashMap<>();
        Queue<Pair> nodeQueue = new LinkedList<>();

        Pair root = new Pair(A, 0);
        nodeQueue.add(root);

        while(!nodeQueue.isEmpty()){
            Pair currentPair = nodeQueue.poll();
            TreeNode currentNode = currentPair.node;
            int currentLevel = currentPair.level;

            minLevel = Math.min(minLevel, currentLevel);
            maxLevel = Math.max(maxLevel, currentLevel);

            if(!nodeMap.containsKey(currentLevel)){
                ArrayList<Integer> currentList = new ArrayList<>();
                currentList.add(currentNode.val);
                nodeMap.put(currentLevel, currentList);
            }
            else{
                ArrayList<Integer> currentList = nodeMap.get(currentLevel);
                currentList.add(currentNode.val);
                nodeMap.put(currentLevel, currentList);
            }

            if(currentNode.left != null){
                Pair leftPair = new Pair(currentNode.left, currentLevel-1);
                nodeQueue.add(leftPair);
            }
            if(currentNode.right != null){
                Pair rightPair = new Pair(currentNode.right, currentLevel+1);
                nodeQueue.add(rightPair);
            }
        }

        return getVerticalOrderTraversalArray(nodeMap, minLevel, maxLevel);
    }

    public ArrayList<ArrayList<Integer>> getVerticalOrderTraversalArray(HashMap<Integer, ArrayList<Integer>> nodeMap, int minLevel, int maxLevel){

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        for(int i=minLevel; i<=maxLevel; i++){
            ArrayList<Integer> tempList = nodeMap.getOrDefault(i, new ArrayList<>());
            ans.add(tempList);
        }

        return ans;
    }
}
