import java.util.*;
public class Graph{
	private Map<Integer, List<Integer>> adjList; 
	private boolean isDirected;
	public Graph(boolean isDirected){
		this.isDirected=isDirected;
	    adjList=new HashMap<>();
	}
	public void add(int src,int dest){
		adjList.putIfAbsent(src,new ArrayList<>());
		adjList.putIfAbsent(dest,new ArrayList<>());
		adjList.get(src).add(dest);
		if(!isDirected){
			adjList.get(dest).add(src);
		}
	}
	public void removeEdge(int src,int dest){
		List<Integer>srcList=adjList.get(src);
		List<Integer>destList=adjList.get(dest);
		if(srcList!=null)srcList.remove((Integer)dest);
		if(!isDirected&&destList!=null)destList.remove((Integer)src);
	}
	 public void printGraph(){
        for(Map.Entry<Integer,List<Integer>>entry:adjList.entrySet()){
            System.out.println(entry.getKey()+ "->" + entry.getValue());
        }
    }
	public void bfs(int start) {
        Set<Integer>visited= new HashSet<>();
        Queue<Integer> queue= new LinkedList<>();
        visited.add(start);
        queue.add(start);
		System.out.println("bfs travesal:");
		while(!queue.isEmpty()){
			int vertex=queue.poll();
			System.out.print(vertex+ " ");
            for (int neighbor:adjList.getOrDefault(vertex,new ArrayList<>())){
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.add(neighbor);
                }
            }
        }
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		Graph graph =new Graph(false);
		System.out.println("enter number of edges:");
		int edges=sc.nextInt();
		System.out.println("enter edges(format:src dest):");
		for(int i=0;i<edges;i++){
			int src=sc.nextInt();
			int dest=sc.nextInt();
			graph.add(src,dest);
		}
		System.out.println("Graph:");
		graph.printGraph();
		System.out.println("Enter starting node for BFS:");
        int start = sc.nextInt();
		graph.bfs(start);
	}
}
		