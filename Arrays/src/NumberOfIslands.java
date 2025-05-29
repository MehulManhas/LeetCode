//https://leetcode.com/problems/number-of-islands/description/?envType=daily-question&envId=2024-04-19
public class NumberOfIslands {
    public int numIslands(char[][] grid) {
        char[][] gridCopy = new char[grid.length][grid[0].length];
        int row = grid.length;
        int col = grid[0].length;
        int numberOfIslands = 0;

        for(int i=0; i<grid.length; i++){
            for(int j=0;j<grid[0].length;j++) {
                gridCopy[i][j] = grid[i][j];
            }
        }

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(gridCopy[i][j] == '1'){
                    numberOfIslands++;
                    gridCopy = helper(gridCopy, i, j);
                }
            }
        }

        return numberOfIslands;
    }
    public char[][] helper(char[][] grid, int row, int col){
        if(row < 0 || row > grid.length-1 || col < 0 || col > grid[0].length-1 || grid[row][col] != '1'){
            return grid;
        }

        grid[row][col] = '0';
        grid = helper(grid, row+1, col);
        grid = helper(grid, row, col+1);
        grid = helper(grid, row, col-1);
        grid = helper(grid, row-1, col);

        return grid;
    }
}
