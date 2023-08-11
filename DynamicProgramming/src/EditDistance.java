import java.util.Arrays;

public class EditDistance {
    String A;
    String B;

    int[][] DpArr;
    public EditDistance(){}


    public void createDpArr(String A, String B){
        this.A = A;
        this.B = B;


        DpArr = new int[A.length()][B.length()];

        for(int[] row : DpArr){
            Arrays.fill(row, -1);
        }
    }
    public int calculateThroughDP(String A, String B, int AIdx, int BIdx){

        if(AIdx < 0){
            return BIdx + 1;
        }

        if(BIdx < 0){
            return AIdx + 1;
        }

        if(DpArr[AIdx][BIdx] != -1){
            return DpArr[AIdx][BIdx];
        }

        if(DpArr[AIdx][BIdx] == -1){
            if(A.charAt(AIdx) == B.charAt(BIdx)){
                DpArr[AIdx][BIdx] = calculateThroughDP(A, B, AIdx-1, BIdx-1);
            }
            else{
                DpArr[AIdx][BIdx] = 1 + Math.min(calculateThroughDP(A, B, AIdx-1, BIdx), Math.min(calculateThroughDP(A, B, AIdx-1, BIdx-1), calculateThroughDP(A, B, AIdx, BIdx-1)));
            }
        }

        return DpArr[AIdx][BIdx];
    }
}
