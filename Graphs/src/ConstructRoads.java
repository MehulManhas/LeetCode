import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class ConstructRoads {

    int modValue = (int) Math.pow(10, 9) + 7;
    public int solve(int A, int[][] B) {
        int[] constructed = new int[A+1];
        Arrays.fill(constructed, -1);

        ArrayList<ArrayList<Integer>> adjacencyList = createAdjacencyList(A, B);

        if(solve(adjacencyList, constructed)){
            return calculateRoads(constructed, A, B);
        }

        return 0;
    }

    public ArrayList<ArrayList<Integer>> createAdjacencyList(int A, int[][] B){
        ArrayList<ArrayList<Integer>> adjacencyList = new ArrayList<>();

        for(int i=0; i<=A; i++){
            adjacencyList.add(new ArrayList<>());
        }

        for(int i=0; i<B.length; i++){
            int source = B[i][0];
            int destination = B[i][1];

            adjacencyList.get(source).add(destination);
            adjacencyList.get(destination).add(source);
        }

        return adjacencyList;
    }

    public boolean solve(ArrayList<ArrayList<Integer>> adjacencyList, int[] constructed){
        Queue<Integer> cityQueue = new LinkedList<>();
        cityQueue.add(1);

        constructed[1] = 0;

        while(!cityQueue.isEmpty()){
            int currentCity = cityQueue.poll();

            for(int neighbourCity : adjacencyList.get(currentCity)){
                if(constructed[currentCity] == constructed[neighbourCity]){
                    return false;
                }
                else if(constructed[neighbourCity] == -1){
                    cityQueue.add(neighbourCity);
                    constructed[neighbourCity] = constructed[currentCity] == 1 ? 0 : 1;
                }
            }
        }

        return true;
    }

    public int calculateRoads(int[] constructed, int A, int[][] B){

        long countOfZeros = 0;
        long countOfOnes = 0;
        for(int i=1; i<=A; i++){
            if(constructed[i] == 0){
                countOfZeros++;
            }
            else if(constructed[i] == 1){
                countOfOnes++;
            }
        }

        return (int) ((countOfOnes%modValue * countOfZeros%modValue)%modValue - B.length)%modValue;
    }
}
