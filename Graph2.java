//create a graph using Adjacency List
import java.util.*;
public class Graph2{
    private Map<Integer, List<Integer>> adjList;
    public Graph2() {
        adjList = new HashMap<>();
    }
    // Add a vertex to the graph
    public void addVertex(int vertex) {
        adjList.putIfAbsent(vertex, new ArrayList<>());
    }
    // Add an edge to the graph (directed)
    public void addEdge(int from, int to) {
        adjList.putIfAbsent(from, new ArrayList<>());
        adjList.putIfAbsent(to, new ArrayList<>());
        adjList.get(from).add(to);
    }
    // Print the adjacency list
    public void printGraph() {
        for (int vertex : adjList.keySet()) {
            System.out.print(vertex + " -> ");
            List<Integer> neighbors = adjList.get(vertex);
            System.out.println(neighbors);
        }
    }
    public static void main(String[] args) {
        Graph2 graph = new Graph2();
        // Adding vertices
        graph.addVertex(0);
        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);
        // Adding edges
        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(1,2);
        graph.addEdge(2,0);
        graph.addEdge(2,3);
        graph.addEdge(3,3);
        // Print the graph
        graph.printGraph();
    }
}
