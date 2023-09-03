import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class TaskScheduling {

    public TaskScheduling(){}

    public int solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        Queue<Integer> taskQueue = new LinkedList<>(A);

        int time = 0;

        for (int i : B){

            while(!taskQueue.isEmpty()){
                if(taskQueue.peek() == i){
                    time++;
                    taskQueue.remove();
                    break;
                }
                else{
                    int removed = taskQueue.remove();
                    taskQueue.add(removed);
                    time++;
                }
            }
        }
        return time;
    }
}
