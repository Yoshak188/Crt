import java.util.*;
public class GraphPathCheck{
    private Map<Integer,List<Integer>> adjList;
    public GraphPathCheck() {
        adjList = new HashMap<>();
    }
    // Add an edge (directed)
    public void addEdge(int from, int to) {
        adjList.putIfAbsent(from, new ArrayList<>());
        adjList.putIfAbsent(to, new ArrayList<>());
        adjList.get(from).add(to);
    }
    // Check if a path exists using BFS
    public boolean pathExistsBFS(int start, int end) {
        if (start == end) return true;
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();
        visited.add(start);
        queue.offer(start);
        while (!queue.isEmpty()) {
            int current = queue.poll();
            for (int neighbor:adjList.getOrDefault(current, new ArrayList<>())) {
                if (neighbor == end) return true;
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.offer(neighbor);
                }
            }
        }
        return false;
    }
    // Check if a path exists using DFS
    public boolean pathExistsDFS(int start, int end) {
        Set<Integer> visited = new HashSet<>();
        return dfsHelper(start, end, visited);
    }
    private boolean dfsHelper(int current, int end, Set<Integer> visited) {
        if (current == end) return true;
        visited.add(current);
        for (int neighbor : adjList.getOrDefault(current, new ArrayList<>())) {
            if (!visited.contains(neighbor)) {
                if (dfsHelper(neighbor, end, visited)) return true;
            }
        }
        return false;
    }
    // Main method to test
    public static void main(String[] args) {
        GraphPathCheck graph = new GraphPathCheck();
        // Example graph
        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(1,3);
        graph.addEdge(2,3);
        graph.addEdge(3,4);
        int start = 0, end = 4;
        // Check path using BFS
        System.out.println("Path exists(BFS):" + graph.pathExistsBFS(start,end));// Check path using DFS
        System.out.println("Path exists(DFS):" + graph.pathExistsDFS(start,end));
    }
}
