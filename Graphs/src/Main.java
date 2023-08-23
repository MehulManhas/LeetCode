import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
//        int[][] A = new int[][]{{1, 2},{2, 3},{3, 4},{4, 5}};
//        //int[][] A1 = new int[][]{{1,2},{2,3},{4,3}};
//        int dest = 5;
//        PathInDirectedGraph pathInDirectedGraph = new PathInDirectedGraph();
//        System.out.println(pathInDirectedGraph.solve(dest, A));
        //int[] input = new int[]{1,1,2,3,4,3,4,1};
//        int B = 7;
//        int C = 7;

//        int[] input = new int[]{1,1,1,3,3,2,2,7,6};
//        int B = 9;
//        int C = 1;
//        FirstDepthFirstSearch firstDepthFirstSearch = new FirstDepthFirstSearch();
//        System.out.println(firstDepthFirstSearch.solve(input, B, C));
//
//        int[][] oranges = new int[][]
//                {
//                {2, 1, 1},
//                {1, 1, 0},
//                {0, 1, 1}
//        };
//
//        RottenOranges rottenOranges = new RottenOranges();
//        System.out.println(rottenOranges.solve(oranges));
//
//        int[][] graph = new int[][]{{0, 1},{0, 2},{1, 2}};
//        int A = 3;
//        CheckBipartiteGraph checkBipartiteGraph = new CheckBipartiteGraph();
//
//        System.out.println(checkBipartiteGraph.solve(A, graph));
//            int n = 4;
//            int[][] trust = new int[][]{{1,3},{2,3},{3,1}};
////            int[][] trust = new int[][]{{1,3},{2,3}};
//            int[][] trust2 = new int[][]{{1,3},{2,3},{4,1}};
//            FindTheTownJudge findTheTownJudge = new FindTheTownJudge();
//            System.out.println(findTheTownJudge.findJudge(n, trust2));

//        int[][] inputArr = new int[][]{
//                {0, 3, 4},
//                {2, 3, 3},
//                {0, 1, 9},
//                {3, 4, 10},
//                {1, 3, 8}
//        };

//        int numberOfNodes = 5;
//        int source = 4;
//
//        Dijsktras dijsktras = new Dijsktras();
//        int[] ans = dijsktras.solve(numberOfNodes, inputArr, source);
//
//        for(int i : ans){
//            System.out.println(i);
//        }

//        int[][] edges = new int[][]{
//                {1,2},
//                {2, 3},
//                {4, 2}
//        };
//
//        FindCenterOfStarGraph findCenterOfStarGraph = new FindCenterOfStarGraph();
//        System.out.println(findCenterOfStarGraph.findCenter(edges));
//        int nodes = 4;
//        int[][] trust = new int[][]{
//                {1, 3},
//                {2, 3},
//                {4, 3},
//                {4, 2},
//                {2, 4},
//                {1, 4}
//        };
//        FindTheTownJudge findTheTownJudge = new FindTheTownJudge();
//        System.out.println(findTheTownJudge.findJudge(nodes, trust));

//        int A = 4;
//        int[][] B = new int[][]{
//                {1, 2, 1},{2, 3, 4},{1, 4, 3},
//                {4, 3, 2},
//                {1, 3, 10}
//        };
//        CommutableIslands commutableIslands = new CommutableIslands();
//        System.out.println(commutableIslands.solve(A, B));

//        int[][] A = new int[][]
//                {
//                        {0 , 50 , 39},
//                        {-1 , 0 , 1},
//                        {-1 , 10 , 0}
//                };
//        FloydWarshall floydWarshall = new FloydWarshall();
//        int[][] ans = floydWarshall.solve(A);
//
//        for(int[] row : ans){
//            for(int i : row){
//                System.out.print(i + " ");
//            }
//            System.out.println();
//        }
//        int[][] edges = new int[][]{
//                {0, 1},
//                {0, 2},
//                {3, 5},
//                {5, 4},
//                {4, 3}
//        };
//
//        int n = 6;
//        int source = 0;
//        int destination = 5;
//        FindIfPathExistsInGraph findIfPathExistsInGraph = new FindIfPathExistsInGraph();
//        System.out.println(findIfPathExistsInGraph.validPath(n, edges, source, destination));

        int[][] B = new int[][]{
                {1, 2},
                {4, 1},
                {2, 4},
                {3, 4},
                {5, 2},
                {1, 3}
        };

        int A = 5;

        CycleInDirectedGraph cycleInDirectedGraph = new CycleInDirectedGraph();
        System.out.println(cycleInDirectedGraph.solve(A, B));

    }
}