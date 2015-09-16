import java.util.PriorityQueue;


public class Child {
	public static void printQueue(){
		
		PriorityQueue<String> q = new PriorityQueue<String>();
		q.offer("first");
		q.offer("second");
		q.offer("third");
		System.out.printf("%s", q);
		
		
		
	}

}
