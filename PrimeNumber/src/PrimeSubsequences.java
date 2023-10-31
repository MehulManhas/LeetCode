import java.util.ArrayList;
import java.util.Arrays;

public class PrimeSubsequences {
    public int solve(ArrayList<Integer> A) {
        int ALength = A.size();
        int mod = (int) (Math.pow(10, 9) + 7);
        int maxNum = (int) (Math.pow(10, 6) + 5);
        int countOfPrimeSubsequences = 0;

        boolean[] primes = new boolean[maxNum];
        Arrays.fill(primes, true);
        primes[1] = false;

        for(int i=2; i*i<maxNum; i++){
            if(primes[i]){
                for(int j=i*i; j<maxNum; j+=i){
                    primes[j] = false;
                }
            }
        }

        int count = 0;

        for(int i=0; i<ALength; i++){
            if(primes[A.get(i)]){
                count++;
            }
        }

        int result = (int) (Math.pow(2, count)%mod);
        return result-1;
    }
}
