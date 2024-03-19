import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MinimumNumberOfArrowsToBurstBalloons {
    public class BalloonComparator implements Comparator<int[]>{
        @Override
        public int compare(int[] arr1, int[] arr2){
            return Integer.compare(arr1[1], arr2[1]) != 0 ? Integer.compare(arr1[1], arr2[1]) : Integer.compare(arr1[0], arr2[0]);
        }
    }
    public int findMinArrowShots(int[][] points) {
        BalloonComparator balloonComparator = new BalloonComparator();
        Arrays.sort(points, balloonComparator);

        int count = 0;
        PriorityQueue<int[]> queue = new PriorityQueue<>(balloonComparator);

        for(int i=0; i<points.length; i++){
            if(queue.isEmpty()){
                queue.add(points[i]);
                count++;
            }
            else if(queue.peek()[1] < points[i][0] && queue.peek()[1] < points[i][1]){
                while(!queue.isEmpty()){
                    queue.poll();
                }
                queue.add(points[i]);
                count++;
            }
        }

        return count;
    }
}
