import java.util.*;

public class DiagonalTraversal {
    public ArrayList<Integer> solve(TreeNode A) {
        int maxLevel = 0;
        HashMap<Integer, ArrayList<Integer>> levelNodeMap = new HashMap<>();
        Stack<Pair> nodeStack = new Stack<>();

        Pair root = new Pair(A, 0);
        nodeStack.add(root);

        while (!nodeStack.isEmpty()){
            Pair currentPair = nodeStack.pop();
            TreeNode currentNode = currentPair.node;
            int currentLevel = currentPair.level;

            maxLevel = Math.max(maxLevel, currentLevel);

            if(!levelNodeMap.containsKey(currentLevel)){
                ArrayList<Integer> currentList = new ArrayList<>();
                currentList.add(currentNode.val);
                levelNodeMap.put(currentLevel, currentList);
            }
            else{
                ArrayList<Integer> currentList = levelNodeMap.get(currentLevel);
                currentList.add(currentNode.val);
                levelNodeMap.put(currentLevel, currentList);
            }

            if(currentNode.right != null){
                Pair rightPair = new Pair(currentNode.right, currentLevel);
                nodeStack.push(rightPair);
            }

            if(currentNode.left != null){
                Pair leftPair = new Pair(currentNode.left, currentLevel+1);
                nodeStack.push(leftPair);
            }
        }

        return  getDiagonalTraversalOutput(levelNodeMap);
    }

    public ArrayList<Integer> getDiagonalTraversalOutput(HashMap<Integer, ArrayList<Integer>> levelNodeMap){

        ArrayList<Integer> ans = new ArrayList<>();
        int itr = 0;
        for(Map.Entry<Integer, ArrayList<Integer>> entry : levelNodeMap.entrySet()){
            ArrayList<Integer> currentLevel = entry.getValue();

            for(Integer i : currentLevel){
                ans.add(itr++, i);
            }
        }

        return ans;
    }
}
