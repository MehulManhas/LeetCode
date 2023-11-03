import java.util.Arrays;

public class SumTheDifference {
    public int solve(int[] A) {
        int mod = (int) Math.pow(10, 9) + 7;
        double max = 0;
        double min = 0;

        Arrays.sort(A);

        for(int i=0; i<A.length; i++){
            double maxContribution = (A[i] * (Math.pow(2, i)))%mod;
            max = max + (maxContribution)%mod;
            double minContribution = (A[i] * (Math.pow(2, (A.length-1-i))))%mod;
            min = min + (minContribution)%mod;
        }

        double diff = (max%mod - min%mod + mod)%mod;

        return (int) diff;
    }
}
