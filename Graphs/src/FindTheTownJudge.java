import java.util.ArrayList;

import java.util.LinkedList;
import java.util.Queue;

public class FindTheTownJudge {

    public FindTheTownJudge(){

    }

    public int findJudge(int n, int[][] trust) {

        if(trust.length == 0 && n <= 1){
            return n;
        }

        if(trust.length == 0 && n > 1){
            return -1;
        }

        ArrayList<ArrayList<Integer>> adjacencyList = createAdjacencyList(trust, n);
        return findPerson(n, adjacencyList);
    }

    public ArrayList<ArrayList<Integer>> createAdjacencyList(int[][] trust, int n){
        ArrayList<ArrayList<Integer>> adjacencyList = new ArrayList<>();
        
        for(int i=0; i<=n; i++){
            adjacencyList.add(new ArrayList<>());
        }

        for(int i=0; i<trust.length; i++){
            adjacencyList.get(trust[i][0]).add(trust[i][1]);
            //adjacencyList.get(trust[i][1]).add(trust[i][0]);
        }

        return adjacencyList;
    }

    public int findPerson(int n, ArrayList<ArrayList<Integer>> adjacencyList){

        int[] countOfEdges = new int[n+1];
        int edges = n-1;


        for(int i=1; i<adjacencyList.size(); i++){
            for(int edge : adjacencyList.get(i)){
                countOfEdges[edge]++;
            }
        }

        for(int i=0; i<countOfEdges.length; i++){
            if(countOfEdges[i] == edges && adjacencyList.get(i).isEmpty()){
                return i;
            }
        }

        return -1;
    }
}
