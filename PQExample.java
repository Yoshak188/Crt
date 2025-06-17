import java.util.PriorityQueue;
public class PQExample{
	public static void main(String[] args){
		PriorityQueue<Integer>pq=new PriorityQueue<>();
		pq.add(10);
		pq.add(5);
		pq.add(30);
		System.out.println("priority Queue:"+pq);
		System.out.println("Min:"+pq.peek());
		System.out.println("Remove Min:"+pq.poll());
		System.out.println("New Min:"+pq.peek());
	}
}
		
