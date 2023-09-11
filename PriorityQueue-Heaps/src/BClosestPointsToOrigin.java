import java.util.PriorityQueue;
import java.util.ArrayList;


//https://www.scaler.com/academy/mentee-dashboard/class/43289/homework/problems/4194/?navref=cl_pb_nv_tb

public class BClosestPointsToOrigin {

    public class Points{

        public int square;
        public int x;
        public int y;
        public Points(int x, int y){
            this.x = x;
            this.y = y;

            square = (x*x) + (y*y);
        }

        public int getXAxisPoint(){
            return this.x;
        }

        public int getYAxisPoint(){
            return this.y;
        }

    }

    public BClosestPointsToOrigin(){

    }

    public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A, int B) {

        PriorityQueue<Points> minHeap = new PriorityQueue<>((a, b) -> a.square - b.square);

        for(ArrayList<Integer> currentPair : A){
            int x = currentPair.get(0);
            int y = currentPair.get(1);

            Points p = new Points(x, y);

            minHeap.add(p);
        }

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        for(int i=0; i<B; i++){
            ArrayList<Integer> currentArr = new ArrayList<>();

            if(!minHeap.isEmpty()){

                Points currentClosestPoint = minHeap.poll();

                currentArr.add(currentClosestPoint.getXAxisPoint());
                currentArr.add(currentClosestPoint.getYAxisPoint());

            }

            ans.add(currentArr);
        }
        return ans;
    }
}
