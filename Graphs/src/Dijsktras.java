import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;

public class Dijsktras {

    public Dijsktras(){}

    public int[] solve(int A, int[][] B, int C) {
        ArrayList<ArrayList<Pair>> adjacencyList = createValueWeightAdjacencyList(B, A);

        return findShortestDistanceFromSource(A, C, adjacencyList);
    }

    public ArrayList<ArrayList<Pair>> createValueWeightAdjacencyList(int[][] inputArr, int numberOfNodes){
        ArrayList<ArrayList<Pair>> adjacencyList = new ArrayList<>();

        for(int i=0; i<numberOfNodes; i++){
            adjacencyList.add(new ArrayList<>());
        }

        for(int i=0; i<inputArr.length; i++){

            int source = inputArr[i][0];
            int destination = inputArr[i][1];
            int weight = inputArr[i][2];

            adjacencyList.get(source).add(new Pair(destination, weight));
            adjacencyList.get(destination).add(new Pair(source, weight));
        }

        return adjacencyList;
    }

    public int[] findShortestDistanceFromSource(int numberOfNodes, int source, ArrayList<ArrayList<Pair>> adjacencyList){

        int[] distanceFromSource = new int[numberOfNodes];

        Arrays.fill(distanceFromSource, Integer.MAX_VALUE);

        PriorityQueue<Pair> minHeap = new PriorityQueue<>((a,b) -> a.weight - b.weight);

        distanceFromSource[source] = 0;

        minHeap.add(new Pair(source, 0));

        while (!minHeap.isEmpty()){

            Pair currentSourceNode = minHeap.poll();

            int currentDistance = currentSourceNode.weight;
            int currentNodeValue = currentSourceNode.node;

            if(currentDistance > distanceFromSource[currentNodeValue]){
                continue;
            }
            else{
                for(int i=0; i<adjacencyList.get(currentNodeValue).size(); i++){
                    Pair neighbourNode = adjacencyList.get(currentNodeValue).get(i);

                    int neighbourNodeValue = neighbourNode.node;
                    int neighbourNodeDistance = neighbourNode.weight;

                    if(distanceFromSource[neighbourNodeValue] > distanceFromSource[currentNodeValue] + neighbourNodeDistance){

                        distanceFromSource[neighbourNodeValue] = distanceFromSource[currentNodeValue] + neighbourNodeDistance;
                        minHeap.add(new Pair(neighbourNodeValue, neighbourNodeDistance));

                    }
                }
            }
        }

        intMaxCheck(distanceFromSource);

        return distanceFromSource;
    }

    public void intMaxCheck(int[] distanceFromSource){

        for(int i=0; i<distanceFromSource.length; i++){
            if(distanceFromSource[i] == Integer.MAX_VALUE){
                distanceFromSource[i] = -1;
            }
        }

    }
}
