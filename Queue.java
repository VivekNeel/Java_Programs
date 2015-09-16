import java.util.PriorityQueue;


public class Queue {
	
	public static void main(String[] args){
		
		PriorityQueue<String> a = new PriorityQueue<String>();
		a.offer("Hello");
		a.offer("bye");
		a.offer("okay");
		System.out.printf("%s" , a);
		System.out.println();
		
		System.out.printf("%s" , a.peek());
		System.out.println();
		a.poll();
		System.out.printf("%s" , a);
		
	}

}
