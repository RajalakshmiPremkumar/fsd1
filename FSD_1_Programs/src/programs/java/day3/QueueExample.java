package programs.java.day3;
import java.util.*;

public class QueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<String> que = new PriorityQueue<String>();
		
		que.add("Raji");
		que.add("Ishu");
		que.add("Sriram");
		que.add("Pavishka");
		que.add("Nethra");
		que.add("Sarvajith");
		que.add("Latha");
		que.add("Chithra");
		que.add("Sudha");
		que.add("Balaj1");
		que.add("Raja");
		que.add("Raji");
		
		System.out.println("Priority Que elements "+ que);
		System.out.println("head using elements "+ que.element());
		System.out.println("head using Peek "+ que.peek());
		
		System.out.println("Iterating  Queue elements: ");
		
		
		Iterator itr = que.iterator();
				
				while (itr.hasNext())
					System.out.println("Elements in Iterator: " + itr.next());
		
		que.remove();
		que.poll();
		que.remove("Raji");
		
		System.out.println(" Queue elements after removing 3 elements: " + que);
		

		
		
		
	}

}
