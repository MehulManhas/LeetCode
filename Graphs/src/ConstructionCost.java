import java.util.ArrayList;
import java.util.Collections;

public class ConstructionCost {

    int mst = 0;

    public static class NodesWeightPair implements Comparable<NodesWeightPair>{
        int source;
        int destination;
        int weight;

        public NodesWeightPair(int source, int destination, int weight){
            this.source = source;
            this.destination = destination;
            this.weight = weight;
        }

        @Override
        public int compareTo(NodesWeightPair o) {
            return this.weight - o.weight;
        }
    }

    public static class DisjointedSetUnion{
        int size = 0;
        int[] parent;

        public DisjointedSetUnion(int size){
            this.size = size;
            parent = new int[size];

            for(int i=0; i<size; i++){
                parent[i] = i;
            }
        }

        public int find(int x){
            if(x == parent[x]){
                return x;
            }

            return find(parent[x]);
        }

        public boolean union(int x, int y){
            int rootX = find(x);
            int rootY = find(y);

            if(rootX == rootY){
                return false;
            }

            if(rootX < rootY){
                parent[rootY] = rootX;
            }
            else {
                parent[rootX] = rootY;
            }

            return true;
        }
    }


    public int solve(int A, int[][] B) {

        int mod = (int) Math.pow(10, 9) + 7;

        DisjointedSetUnion disjointedSetUnion = new DisjointedSetUnion(A+1);
        ArrayList<NodesWeightPair> nodeWeightPairs = createNodesWeightPairs(A, B);

        for(int i=0; i<nodeWeightPairs.size(); i++){
            NodesWeightPair nodesWeightPair = nodeWeightPairs.get(i);
            int source = nodesWeightPair.source;
            int destination = nodesWeightPair.destination;
            int weight = nodesWeightPair.weight;

            if(disjointedSetUnion.union(source, destination)){
                mst = (mst%mod + weight%mod);
            }
        }
        return mst%mod;
    }

    public ArrayList<NodesWeightPair> createNodesWeightPairs(int A, int[][] B){
        ArrayList<NodesWeightPair> nodeWeightPairs = new ArrayList<>();

        for(int i=0; i<B.length; i++){
            int source = B[i][0];
            int destination = B[i][1];
            int weight = B[i][2];

            nodeWeightPairs.add(new NodesWeightPair(source, destination, weight));
        }

        Collections.sort(nodeWeightPairs);

        return nodeWeightPairs;
    }
}
