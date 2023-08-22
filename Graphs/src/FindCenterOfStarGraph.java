import java.util.ArrayList;

public class FindCenterOfStarGraph {

    public FindCenterOfStarGraph(){}

    public int findCenter(int[][] edges) {
        ArrayList<ArrayList<Integer>> adjacencyList = createAdjacencyList(edges);
        int maxEdges = edges.length;

        return getCenterOfGraph(adjacencyList, maxEdges);
    }

    public ArrayList<ArrayList<Integer>> createAdjacencyList(int[][] edges){
        ArrayList<ArrayList<Integer>> adjacencyList = new ArrayList<>();

        for(int i=0; i<=edges.length+1; i++){
            adjacencyList.add(new ArrayList<>());
        }

        for(int i=0; i<edges.length; i++){
            int source = edges[i][0];
            int destination = edges[i][1];
            adjacencyList.get(source).add(destination);
            adjacencyList.get(destination).add(source);
        }

        return adjacencyList;
    }

    public int getCenterOfGraph(ArrayList<ArrayList<Integer>> adjacencyList, int maxEdges){

        for(int i=1; i<adjacencyList.size(); i++){
            if(adjacencyList.get(i).size() == maxEdges){
                return i;
            }
        }

        return -1;
    }
}
