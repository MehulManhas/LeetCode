public class Main {
    public static void main(String[] args) {
        int[][] A = new int[][]{{1, 2},{2, 3},{3, 4},{4, 5}};
        //int[][] A1 = new int[][]{{1,2},{2,3},{4,3}};
        int dest = 5;
        PathInDirectedGraph pathInDirectedGraph = new PathInDirectedGraph();
        System.out.println(pathInDirectedGraph.solve(dest, A));
        int[] input = new int[]{1, 1, 2};
        int B = 2;
        int C = 1;
        FirstDepthFirstSearch firstDepthFirstSearch = new FirstDepthFirstSearch();
        System.out.println(firstDepthFirstSearch.solve(input, C, B));

        int[][] oranges = new int[][]
                {
                {2, 1, 1},
                {1, 1, 0},
                {0, 1, 1}
        };

        RottenOranges rottenOranges = new RottenOranges();
        System.out.println(rottenOranges.solve(oranges));
    }
}