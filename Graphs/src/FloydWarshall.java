public class FloydWarshall {

    public FloydWarshall(){}

    public int[][] solve(int[][] A) {
        //int[][] adjacencyMatrix = createAdjacencyMatrix(A);

        return find(A);
    }

    public int[][] createAdjacencyMatrix(int[][] input){
        int[][] adjacencyMatrix = new int[input.length+1][input[0].length+1];

        for(int i=0; i<adjacencyMatrix.length; i++){
            for(int j=0; j<adjacencyMatrix[0].length; j++){
                if(i==j){
                    adjacencyMatrix[i][j] = 0;
                }
                else{
                    adjacencyMatrix[i][j] = Integer.MAX_VALUE;
                }
            }
        }

        for(int i=0; i<input.length; i++){
            for (int j=0; j<input[0].length; j++){
                if(input[i][j] == -1){
                    continue;
                }
                else {
                    adjacencyMatrix[i + 1][j + 1] = input[i][j];
                }
            }
        }

        return adjacencyMatrix;
    }

    public int[][] find(int[][] adjacencyMatrix){

        for(int i=0; i<adjacencyMatrix.length; i++){
            for(int j=0; j<adjacencyMatrix.length; j++){
                for(int k=0; k<adjacencyMatrix.length; k++){

                    if(adjacencyMatrix[k][i] != -1 && adjacencyMatrix[i][j] != -1){
                        int newDistance = adjacencyMatrix[k][i] + adjacencyMatrix[i][j];

                        if(adjacencyMatrix[k][j] == -1 || adjacencyMatrix[k][j] > newDistance){
                            adjacencyMatrix[k][j] = newDistance;
                        }
                    }
                }
            }
        }
        return adjacencyMatrix;
    }

    public int[][] removeFirstRowAndCol(int[][] adjacencyMatrix){
        int[][] ans = new int[adjacencyMatrix.length-1][adjacencyMatrix.length-1];

        for(int i=1; i<adjacencyMatrix.length; i++){
            for(int j=1; j<adjacencyMatrix[i].length; j++){
                if(adjacencyMatrix[i][j] == Integer.MAX_VALUE){
                    ans[i-1][j-1] = -1;
                }
                else {
                    ans[i-1][j-1] = adjacencyMatrix[i][j];
                }
            }
        }
        return ans;
    }
}
