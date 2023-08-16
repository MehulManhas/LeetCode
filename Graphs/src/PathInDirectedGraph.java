import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class PathInDirectedGraph {

    public PathInDirectedGraph(){}

    public int solve(int A, int[][] B) {
        ArrayList<ArrayList<Integer>> adjacencyList = createAdjacencyList(B);
        return bfs(B, adjacencyList, A) ? 1 : 0;
    }

    public ArrayList<ArrayList<Integer>> createAdjacencyList(int[][] B){
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();

        for(int i=0; i<=B.length+1; i++){
            arr.add(new ArrayList<>());
        }
        for(int i=0; i<B.length; i++){
            arr.get(B[i][0]).add(B[i][1]);
            //arr.get(B[i][1]).add(B[i][0]); Uncomment for undirected graph
        }
        return arr;
    }

    public boolean bfs(int[][] B, ArrayList<ArrayList<Integer>> adjacencyList, int destination){

        boolean[] visited = new boolean[B.length+2];
        Queue<Integer> nodeQueue = new LinkedList<>();

        visited[1] = true;

        nodeQueue.add(1);

        while(!nodeQueue.isEmpty()){
            int u = nodeQueue.poll();

            for(int i=0; i<adjacencyList.get(u).size(); i++){

                int v = adjacencyList.get(u).get(i);

                if(!visited[v]){
                    nodeQueue.add(v);
                    visited[v] = true;
                }
            }
        }
        return visited[destination];
    }

}
