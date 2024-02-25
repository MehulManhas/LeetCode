import java.util.Arrays;

public class MinSumPathInMatrix {

    int[][] dpArr;
    public int minPathSum(int[][] A) {

        if(A.length == 1 && A[0].length == 1){
            return A[0][0];
        }

        dpArr = new int[A.length][A[0].length];

        for(int[] row : dpArr){
            Arrays.fill(row, Integer.MAX_VALUE);
        }


        return calcThroughDp(A, A.length-1, A[0].length-1);
    }

    public int min(int a, int b, int c){
        if(a < b){
            return (a < c) ? a : c;
        }
        else{
            return (b < c) ? b : c;
        }
    }


    public int calcThroughDp(int[][] A, int row, int col){

        if(row < 0 || col < 0){
            return Integer.MAX_VALUE;
        }
        else if(row == 0 && col == 0){
            return dpArr[row][col];
        }
        else{
            dpArr[row][col] = A[row][col] + Math.min(calcThroughDp(A, row-1, col), calcThroughDp(A, row, col-1));
        }

        return dpArr[row][col];
    }
}
