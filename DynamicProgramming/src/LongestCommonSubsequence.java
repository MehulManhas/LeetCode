import java.util.Arrays;

public class LongestCommonSubsequence {
    String A = "";
    String B = "";

    int[][] DpArr;

    public LongestCommonSubsequence(){}

    public void setValues(String A, String B){
        this.A = A;
        this.B = B;

    }

    public int calculateLongestCommonSubsequence(){
        DpArr = new int[A.length()+1][B.length()+1];
        for (int[] row : DpArr) {
            Arrays.fill(row, -1);
        }

        return calcualteThroughDP(A.length()-1, B.length()-1);
    }

    public int calcualteThroughDP(int AIdx, int BIdx){

        if(AIdx < 0 || BIdx < 0){
            return 0;
        }

        if(DpArr[AIdx][BIdx] != -1){
            return DpArr[AIdx][BIdx];
        }

        if(DpArr[AIdx][BIdx] == -1){
            if(A.charAt(AIdx) == B.charAt(BIdx)){
                DpArr[AIdx][BIdx] = 1 + calcualteThroughDP(AIdx-1, BIdx-1);
            }
            else {
                DpArr[AIdx][BIdx] = Math.max(calcualteThroughDP(AIdx-1, BIdx), calcualteThroughDP(AIdx, BIdx-1));
            }

        }
        return DpArr[AIdx][BIdx];
    }
}
