import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class FreeCars {
    public int solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Pair> pairs = new ArrayList<>();
        int n = A.size();

        for(int i = 0; i < n; i++) {
            pairs.add(new Pair(A.get(i), B.get(i)));
        }

        Collections.sort(pairs, Comparator.comparingInt(a -> a.time));

        PriorityQueue<Integer> que = new PriorityQueue<>();

        int time = 0;

        for(int i = 0; i < n; i++) {
            if(time < pairs.get(i).time) {
                que.add(pairs.get(i).value);
                time += 1;
            } else {
                int min = que.peek();
                if(min < pairs.get(i).value) {
                    que.poll();
                    que.add(pairs.get(i).value);
                }
            }
        }
        long profit = 0;
        while(!que.isEmpty()) {
            profit = (profit + que.poll()) % 1000000007;
        }
        return (int) profit;
    }
    public class Pair {
        int time;
        int value;
        Pair(int t, int v) {
            time = t;
            value = v;
        }
    }
}
