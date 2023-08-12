import java.util.Arrays;

public class ClimbingStairs {
    int stairs;

    int[] DpArr;
    public ClimbingStairs(){}

    public void createDpArr(int stairs){
        this.stairs = stairs;
        this.DpArr = new int[stairs+1];

        Arrays.fill(DpArr, -1);
    }

    public int calculateThroughDp(int Idx){

        if(Idx < 0){
            return 0;
        }

        if(Idx == 0 || Idx == 1){
            DpArr[Idx] = 1;
            return DpArr[Idx];
        }

        if(this.DpArr[Idx] == -1){
            DpArr[Idx] = calculateThroughDp(Idx-1) + calculateThroughDp(Idx-2);
        }
        return DpArr[Idx];
    }
}
