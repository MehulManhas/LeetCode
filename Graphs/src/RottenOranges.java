import java.util.LinkedList;
import java.util.Queue;

 class Pairs {
    int num1;
    int num2;

    public Pairs(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public Pairs(){}
}
public class RottenOranges {
    int[][] timeArr;
    Queue<Pairs> nodeQueue;
    public RottenOranges(){}

    public int solve(int[][] A) {
        initializeQueue(A);
        bfs(A);

        return checkForOranges(A, timeArr);
    }

    public void initializeQueue(int[][] A){
        timeArr = new int[A.length][A[0].length];
        nodeQueue = new LinkedList<>();

        for(int i=0; i<A.length; i++){
            for(int j=0; j<A[i].length; j++){
                if(A[i][j] == 2){
                    nodeQueue.add(new Pairs(i, j));
                    timeArr[i][j] = 0;
                }
            }
        }
    }

    public void bfs(int[][] A){
        while (!nodeQueue.isEmpty()){
            Pairs currPairs = nodeQueue.poll();

            int i= currPairs.num1;
            int j= currPairs.num2;

            if(j-1 >=0 && A[i][j-1] == 1){
                A[i][j-1] = 2;
                timeArr[i][j-1] = timeArr[i][j] + 1;
                nodeQueue.add(new Pairs(i, j-1));
            }
            if(j+1 < A[i].length && A[i][j+1] == 1){
                A[i][j+1] = 2;
                timeArr[i][j+1] = timeArr[i][j] + 1;
                nodeQueue.add(new Pairs(i, j+1));
            }
            if(i-1 >=0 && A[i-1][j] == 1){
                A[i-1][j] = 2;
                timeArr[i-1][j] = timeArr[i][j] + 1;
                nodeQueue.add(new Pairs(i-1, j));
            }
            if(i+1 < A.length && A[i+1][j] == 1){
                A[i+1][j] = 2;
                timeArr[i+1][j] = timeArr[i][j] + 1;
                nodeQueue.add(new Pairs(i+1, j));
            }
        }
    }

    public int checkForOranges(int[][] A, int[][] timeArr){
        int time = 0;

        for(int i=0; i<A.length; i++){
            for(int j=0; j<A[i].length; j++){
                if(A[i][j] == 1){
                    return -1;
                }
                time = Math.max(time, timeArr[i][j]);
            }
        }

        return time;
    }

}
