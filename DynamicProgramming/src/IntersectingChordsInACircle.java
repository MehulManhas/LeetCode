import java.util.Arrays;

public class IntersectingChordsInACircle {
    int[] DpArr;
    int mod = (int) Math.pow(10,9) + 7;

    public IntersectingChordsInACircle(){

    }

    public int chordCnt(int A) {
        DpArr = new int[A+1];
        Arrays.fill(DpArr, -1);

        DpArr[0] = 1;
        DpArr[1] = 1;

        return countChrods(A);
    }

    public int countChrods(int A){

        if(A <= 1){
            return 1;
        }

        if(DpArr[A] != -1){
            return DpArr[A];
        }

        if(DpArr[A] == -1){

            long ans = 0;

            for(int i=0; i<A; i++){
                ans += (long) countChrods(i)%mod * (long) countChrods(A-i-1)%mod;
                ans %= mod;
            }

            DpArr[A] = (int) ans%mod;
        }
        return DpArr[A];
    }
}
