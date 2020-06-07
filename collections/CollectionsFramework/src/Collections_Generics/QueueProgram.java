package Collections_Generics;

import java.util.PriorityQueue;


public class QueueProgram {

	public static void main(String[] args) {
		
		PriorityQueue q = new PriorityQueue();
		q.offer("a");
		q.offer("b");
		q.offer("d");
		q.offer("c");
		q.offer("a");
		System.out.println(q);
		
		//returns null if empty(to remove and return)
		System.out.println(q.poll());
		System.out.println(q);
		
		//Returns run time exception(to remove and return)
		System.out.println(q.remove());
		System.out.println(q);

		//returns null if empty(to return)
		System.out.println(q.peek());
        System.out.println(q);
		
		//Returns run time exception(to return)
		System.out.println(q.element());
		System.out.println(q);
	}
}
