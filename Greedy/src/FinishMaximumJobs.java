import java.util.Arrays;

public class FinishMaximumJobs {
    public class StartEndTimePair{
        int start = 0;
        int end = 0;

        public StartEndTimePair(int start, int end){
            this.start = start;
            this.end = end;
        }
    }

    public int solve(int[] A, int[] B){
        StartEndTimePair[] pairs = new StartEndTimePair[A.length];
        int ans = 0;

        for(int i=0; i<A.length; i++){
            pairs[i] = new StartEndTimePair(A[i], B[i]);
        }

        Arrays.sort(pairs, (a,b) -> Integer.compare(a.end, b.end));

        int lastEndTime = 0;

        for(int i=0; i<A.length; i++){
            int currentStart = pairs[i].start;
            int currentEnd = pairs[i].end;

            if(currentStart >= lastEndTime){
                lastEndTime = currentEnd;
                ans++;
            }
        }

        return ans;
    }
}
