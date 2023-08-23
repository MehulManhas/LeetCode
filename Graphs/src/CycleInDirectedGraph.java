import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class CycleInDirectedGraph {
    int[] incomingEdgesCount;
    public CycleInDirectedGraph(){}

    public int solve(int A, int[][] B) {
        ArrayList<ArrayList<Integer>> adjacencyList = createAdjacencyList(A, B);

        return checkIfCycleExists(adjacencyList, A);
    }

    public ArrayList<ArrayList<Integer>> createAdjacencyList(int A, int[][] B){
        incomingEdgesCount = new int[A+1];

        ArrayList<ArrayList<Integer>> adjacencyList = new ArrayList<>();

        for(int i=0; i<=A; i++){
            adjacencyList.add(new ArrayList<>());
        }

        for(int i=0; i<B.length; i++){
            adjacencyList.get(B[i][0]).add(B[i][1]);
            incomingEdgesCount[B[i][1]]++;
        }

        return adjacencyList;
    }

    public int checkIfCycleExists(ArrayList<ArrayList<Integer>> adjacencyList, int A){

        Queue<Integer> nodeQueue = new LinkedList<>();

        for(int i=1; i<=A; i++){
            if(incomingEdgesCount[i] == 0){
                nodeQueue.add(i);
            }
        }

        while(!nodeQueue.isEmpty()){
            int sourceNode = nodeQueue.poll();

            for(int i=0; i<adjacencyList.get(sourceNode).size(); i++){

                int destinationNode = adjacencyList.get(sourceNode).get(i);

                incomingEdgesCount[destinationNode]--;

                if(incomingEdgesCount[destinationNode] == 0){
                    nodeQueue.add(destinationNode);
                }
            }
        }

        return checkAllEdgeCount();
    }

    public int checkAllEdgeCount(){
        for(int i=1; i<incomingEdgesCount.length; i++){
            if(incomingEdgesCount[i] != 0){
                return 1;
            }
        }
        return 0;
    }
}
