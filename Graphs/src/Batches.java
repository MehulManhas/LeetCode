import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Batches {

    private static class StudentStrengthPair{
        int student;
        int strength;

        public StudentStrengthPair(int student, int strength){
            this.student = student;
            this.strength = strength;
        }

    }

    public int solve(int A, int[] B, int[][] C, int D) {
        boolean[] visited = new boolean[A+1];
        int totalBatchSize = 0;

        ArrayList<ArrayList<Integer>> adjacencyList = createAdjacencyList(A, B, C);

        int totalBatches = bfs(adjacencyList, visited, A, B, D, totalBatchSize);

        return totalBatches;
    }

    public ArrayList<ArrayList<Integer>> createAdjacencyList(int A, int[] B, int[][] C){
        ArrayList<ArrayList<Integer>> adjacencyList = new ArrayList<>();

        for(int i=0; i<=A; i++){
            adjacencyList.add(new ArrayList<>());
        }

        for(int i=0; i<C.length; i++){
            int student1 = C[i][0];
            int student2 = C[i][1];

            adjacencyList.get(student1).add(student2);
            adjacencyList.get(student2).add(student1);
        }

        return adjacencyList;
    }

    public int bfs(ArrayList<ArrayList<Integer>> adjacencyList, boolean[] visited, int A, int[] B, int D,int totalBatchSize){
        Queue<Integer> studentQueue = new LinkedList<>();
        studentQueue.add(1);

        int currentBatchSize = B[0];

        while (!studentQueue.isEmpty()){
            int currentStudent = studentQueue.poll();
            visited[currentStudent] = true;

            for(int i=0; i<adjacencyList.get(currentStudent).size(); i++){
                int neighbourStudent = adjacencyList.get(currentStudent).get(i);

                if(!visited[neighbourStudent]){
                    currentBatchSize += B[neighbourStudent-1];
                    visited[neighbourStudent] = true;
                    studentQueue.add(neighbourStudent);
                }
            }

            if(studentQueue.isEmpty()){
                if(currentBatchSize >= D){
                    totalBatchSize++;
                }

                for(int i=1; i<=A; i++){
                    if(!visited[i]){
                        studentQueue.add(i);
                        currentBatchSize = B[i-1];
                        visited[i] = true;
                        break;
                    }
                }
            }

        }

        return totalBatchSize;
    }

}
