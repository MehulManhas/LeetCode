import java.util.ArrayList;
import java.util.Arrays;

public class DungeonPrincess {
    public DungeonPrincess() {
    }

    int[][] DpArray;

    public int calculateMinimumHP(int[][] A) {
        DpArray = new int[A.length][A[0].length];
        for (int[] row : DpArray) {
            Arrays.fill(row, -1);
        }

        return minHealthDp(0, 0, A);
    }

    public int minHealthDp(int row, int col, int[][] A) {

        if (row >= A.length || col >= A[0].length) {
            return Integer.MAX_VALUE;
        }

        if (row == A.length - 1 && col == A[0].length - 1) {
            return Math.max(1, 1 - A[row][col]);
        }

        if (DpArray[row][col] == -1) {

            int down = minHealthDp(row + 1, col, A);
            int right = minHealthDp(row, col + 1, A);

            int val = Math.max(1, Math.min(down, right) - A[row][col]);
            DpArray[row][col] = val;
        }
        return DpArray[row][col];
    }
}
