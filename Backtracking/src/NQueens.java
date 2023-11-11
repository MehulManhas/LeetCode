import java.util.ArrayList;

public class NQueens {
    ArrayList<ArrayList<String>> ans;
    public ArrayList<ArrayList<String>> solveNQueens(int A) {
        int[][] board = new int[A][A];
        ans = new ArrayList<>();
        solveNQUtil(board, 0, A);
        return ans;
    }

    public boolean isSafe(int board[][], int row, int col, int N){

        int i, j;

        for(i = row-1; i>=0; i--){
            if(board[i][col] == 1){
                return false;
            }
        }

        for(i = row-1, j = col-1; i>=0 && j>=0; i--, j--){
            if(board[i][j] == 1){
                return false;
            }
        }

        for(i = row-1, j = col+1; j<N &&  i>=0; i--, j++){
            if(board[i][j] == 1){
                return false;
            }
        }

        return true;
    }

    public void solveNQUtil(int board[][], int row, int N){

        if(row == N){
            addSolution(board,N);
            return;
        }

        for(int i=0; i<N; i++){

            if(isSafe(board, row, i, N)){
                board[row][i] = 1;

                solveNQUtil(board, row + 1, N);

                board[row][i] = 0;
            }
        }
    }

    public void addSolution(int board[][], int N){

        ArrayList<String> solution = new ArrayList<>();

        for(int i=0; i<board.length; i++){
            StringBuilder currentRow = new StringBuilder();
            for (int j=0; j<board[i].length; j++){
                if(board[i][j] == 1){
                    currentRow.append("Q");
                }
                else{
                    currentRow.append(".");
                }
            }
            solution.add(currentRow.toString());
        }

        ans.add(solution);
    }
}
