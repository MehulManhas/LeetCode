import java.util.Arrays;

public class RegexPatternMatching {
    int[][] DpArr;

    public RegexPatternMatching(){}

    public void createDpArr(String A, String B){
        DpArr = new int[A.length()][B.length()];

        for(int[] row : DpArr){
            Arrays.fill(row, -1);
        }
    }

    public int calculateThroughDP(String A, String B, int AIdx, int BIdx){

        if(AIdx < 0 && BIdx < 0){
            return 1;
        }

        if(AIdx < 0){
            for(char c : B.toCharArray()){
                if(c != '*'){
                    return 0;
                }
            }
            return 1;
        }

        if(BIdx < 0){
            return 0;
        }

        if(DpArr[AIdx][BIdx] == 0){
            return 0;
        }

        if(DpArr[AIdx][BIdx] == -1){

            if(A.charAt(AIdx) == B.charAt(BIdx) || B.charAt(BIdx) == '?'){
                DpArr[AIdx][BIdx] = calculateThroughDP(A, B, AIdx-1, BIdx-1);
            }
            else if(B.charAt(BIdx) == '*'){
                DpArr[AIdx][BIdx] = calculateThroughDP(A, B, AIdx-1, BIdx) | calculateThroughDP(A, B, AIdx, BIdx-1);
            }
            else{
                DpArr[AIdx][BIdx] = 0;
            }
        }
        return DpArr[AIdx][BIdx];
    }
}
