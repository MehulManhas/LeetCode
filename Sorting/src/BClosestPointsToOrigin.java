import java.util.Comparator;
import java.util.PriorityQueue;

public class BClosestPointsToOrigin {
    public int[][] solve(int[][] A, int B) {
        return findClosestPoint(A, B);
    }

    public int[][] findClosestPoint(int[][] A, int B){
        PriorityQueue<int[]> heap = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return ((o1[0]*o1[0]) + (o1[1]*o1[1])) - ((o2[0]*o2[0]) + (o2[1]*o2[1]));
            }
        });

        for(int[] row : A){
            heap.add(row);
        }

        return getClosestPoints(heap, B);
    }

    public int[][] getClosestPoints(PriorityQueue<int[]> heap, int B){
        int[][] ans = new int[B][2];

        int i=0;
        while(B > 0){
            ans[i++] = heap.poll();
            B--;
        }

        return ans;
    }
}
