public class Main {
    public static void main(String[] args) {
        int[][] A = new int[][]{{1, 2},{2, 3},{3, 4},{4, 5}};
        //int[][] A1 = new int[][]{{1,2},{2,3},{4,3}};
        int dest = 5;
        PathInDirectedGraph pathInDirectedGraph = new PathInDirectedGraph();
        System.out.println(pathInDirectedGraph.solve(dest, A));
    }
}