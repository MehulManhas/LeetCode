import java.util.*;

public class AllAncestorsOfANodeInADirectedAcyclicGraph {
    public List<List<Integer>> getAncestors(int n, int[][] edges) {

        return solve(n, edges);
    }
    public List<List<Integer>> solve(int n, int[][] edges){
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        int[] inDegree = new int[n];
        for(int i=0; i<n; i++){
            adjList.add(new ArrayList<>());
        }

        for(int i=0; i<edges.length; i++){
            int source = edges[i][0];
            int dest = edges[i][1];

            adjList.get(source).add(dest);
            inDegree[dest]++;
        }


        return bfs(n, adjList, inDegree);
    }
    public List<List<Integer>> bfs(int n, ArrayList<ArrayList<Integer>> adjList, int[] inDegree){
        List<List<Integer>> ans = new ArrayList<>();

        Queue<Integer> queue = new LinkedList<>();

        for(int i=0; i<inDegree.length; i++){
            if(inDegree[i] == 0){
                queue.add(i);
            }
        }

        List<Integer> topologicalOrder = new ArrayList<>();

        while(!queue.isEmpty()){
            Integer currentNode = queue.poll();
            topologicalOrder.add(currentNode);

            for(int i=0; i<adjList.get(currentNode).size(); i++){

                inDegree[adjList.get(currentNode).get(i)]--;

                if(inDegree[adjList.get(currentNode).get(i)] == 0){
                    queue.add(adjList.get(currentNode).get(i));
                }
            }
        }

        List<Set<Integer>> ancestorListSet = new ArrayList<>();

        for(int i=0; i<n; i++){
            ans.add(new ArrayList<>());
            ancestorListSet.add(new HashSet<>());
        }

        for(int node : topologicalOrder){
            for(int neighbor : adjList.get(node)){
                ancestorListSet.get(neighbor).add(node);
                ancestorListSet.get(neighbor).addAll(ancestorListSet.get(node));
            }
        }

        for(int i=0; i<ancestorListSet.size(); i++){
            ans.get(i).addAll(ancestorListSet.get(i));
            Collections.sort(ans.get(i));
        }

        return ans;
    }
}
