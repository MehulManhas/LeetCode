//https://www.scaler.com/academy/mentee-dashboard/class/46135/assignment/problems/376/?navref=cl_pb_nv_tb

import java.util.ArrayList;
import java.util.PriorityQueue;


//Using Kruskals
public class CommutableIslands {

    int mod = (int) Math.pow(10, 9)+7;

    public class NodeWeightPair implements Comparable<NodeWeightPair>{

        int destination;
        int weight;
        public NodeWeightPair(int destination, int weight){
            this.destination = destination;
            this.weight = weight;
        }

        @Override
        public int compareTo(NodeWeightPair o) {
            return this.weight - o.weight;
        }
    }
    public int solve(int A, int[][] B) {
        ArrayList<ArrayList<NodeWeightPair>> adjacencyMatrix = createAdjacencyMatrix(B, A);

        return findPathWithLeastWeight(A,adjacencyMatrix);
    }

    public ArrayList<ArrayList<NodeWeightPair>> createAdjacencyMatrix(int[][] B, int A){

        ArrayList<ArrayList<NodeWeightPair>> adjacencyList = new ArrayList<>();

        for(int i=0; i<=A; i++){
            adjacencyList.add(new ArrayList<>());
        }

        for(int i=0; i<B.length; i++){
            int source = B[i][0];
            int destination = B[i][1];
            int weight = B[i][2];

            adjacencyList.get(source).add(new NodeWeightPair(destination, weight));
            adjacencyList.get(destination).add(new NodeWeightPair(source, weight));
        }

        return adjacencyList;
    }

    public int findPathWithLeastWeight(int A, ArrayList<ArrayList<NodeWeightPair>> adjacencyMatrix){
        boolean[] visited = new boolean[A+1];
        int ans = 0;
        PriorityQueue<NodeWeightPair> minHeap = new PriorityQueue<>();

        minHeap.offer(new NodeWeightPair(1, 0));

        while (!minHeap.isEmpty()){
            NodeWeightPair currentNodeWeightPair = minHeap.poll();

            if(visited[currentNodeWeightPair.destination]){
                continue;
            }
            visited[currentNodeWeightPair.destination] = true;
            ans = (ans + currentNodeWeightPair.weight)%mod;

            for(NodeWeightPair neighbourNodeWightPair : adjacencyMatrix.get(currentNodeWeightPair.destination)){
                if(!visited[neighbourNodeWightPair.destination]){
                    minHeap.offer(neighbourNodeWightPair);
                }
            }
        }

        return ans;
    }
}
