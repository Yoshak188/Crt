import java.util.*;
public class GraphDFS{
    private Map<Integer, List<Integer>> adjList;
    public GraphDFS(){
        adjList=new HashMap<>();
    }
    // Add a vertex
    public void addVertex(int vertex){
        adjList.putIfAbsent(vertex, new ArrayList<>());
    }
    // Add an edge (directed)
    public void addEdge(int from,int to) {
        adjList.putIfAbsent(from,new ArrayList<>());
        adjList.putIfAbsent(to,new ArrayList<>());
        adjList.get(from).add(to);
    }
    // DFS traversal
    public void dfs(int start){
        Set<Integer> visited = new HashSet<>();
        System.out.print("DFS Traversal starting from vertex " + start + ": ");
        dfsUtil(start,visited);
        System.out.println();
    }
    // Utility function for recursive DFS
    private void dfsUtil(int vertex,Set<Integer>visited){
        visited.add(vertex);
        System.out.print(vertex + " ");
        for (int neighbor:adjList.get(vertex)){
            if (!visited.contains(neighbor)){
                dfsUtil(neighbor,visited);
            }
        }
    }
    public static void main(String[] args){
        GraphDFS graph=new GraphDFS();
        // Add edges
        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(1,2);
        graph.addEdge(2,0);
        graph.addEdge(2,3);
        graph.addEdge(3,3);
        // Perform DFS starting from vertex 0
        graph.dfs(2);
    }
}
