public class GraphMatrix{
    private int[][] adjMatrix;
    private int numVertices;
    // Constructor
    public GraphMatrix(int numVertices){
        this.numVertices=numVertices;
        adjMatrix = new int[numVertices][numVertices];
    }
    // Add edge (directed)
    public void addEdge(int from, int to){
        adjMatrix[from][to] = 1;
    }
    // Print the adjacency matrix
    public void printGraph() {
        System.out.println("Adjacency Matrix:");
        for (int i=0; i<numVertices;i++) {
            for (int j=0; j<numVertices;j++){
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    // Main method
    public static void main(String[] args){
        int vertices = 4;
        GraphMatrix graph = new GraphMatrix(vertices);
        // Add edges
        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(1,2);
        graph.addEdge(2,0);
        graph.addEdge(2,3);
        graph.addEdge(3,3);
        // Print adjacency matrix
        graph.printGraph();
    }
}
