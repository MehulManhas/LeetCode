import java.util.PriorityQueue;

public class ConnectRopes {
    int[] ropes;

    public ConnectRopes(int[] ropes){
        this.ropes = ropes;
    }

    public PriorityQueue<Integer> createMinHeap(){
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for(Integer i : this.ropes){
            minHeap.add(i);
        }

        return minHeap;
    }

    public int computeTotalCostOfConnectingRopes(PriorityQueue<Integer> ropeHeap){
        int totalCost = 0;

        while(ropeHeap.size() > 1){
            int min = ropeHeap.remove();
            int secondMin = ropeHeap.remove();

            totalCost += min + secondMin;

            ropeHeap.add(min + secondMin);
        }

        return totalCost;
    }


}
