package lab7;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueCollection {

	public static void main(String[] args) {
		PriorityQueue<String> queue=new PriorityQueue<String>();
		// Insertion
		queue.add("saurabh");
		queue.add("nisha");
		queue.add("harsha");
		queue.add("deepak");
		queue.add("navya");
		queue.add("ram");
		System.out.println("Insertion: ");
		Iterator itr1=queue.iterator();  
		while(itr1.hasNext()){  
			System.out.println(itr1.next());  
		}
		System.out.println();
		
		
		queue.remove("Sham");
		queue.poll(); // Remove the head of the queue
		System.out.println(queue.peek());
		System.out.println("Deletion: ");
		Iterator itr2=queue.iterator();  
		while(itr2.hasNext()){  
			System.out.println(itr2.next());  
		}
		
	}

}