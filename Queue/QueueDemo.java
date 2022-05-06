package DSA_Interview_Questions.Queue;


import java.util.*;

public class QueueDemo 
{
	public static void main(String[] args) 
	{	
		// FIFO -> First In First Out
		Queue<Integer> q = new LinkedList<>();
		// add in queue happens at rear
		q.add(1);
		q.add(2);
		System.out.println(q);
		System.out.println("Size: " + q.size());
		System.out.println("Front ele: " + q.peek());
		// removing from queue happens from front 
		q.remove();
		System.out.println(q);
		q.remove();
		System.out.println(q);
		
		
		q.add(1);
		System.out.println(q);
		System.out.println("Queue empty -> " + q.isEmpty());
		q.poll(); // removes element from front but does not raise exception
		System.out.println("Queue empty -> " + q.isEmpty());
		System.out.println(q);
		
		// q.remove(); // NoSuchElementException
		
		
		System.out.println("----------------------------\nDeque");
		// deque = double ended queue 
		Deque<Integer> dq = new ArrayDeque<>();
		dq.add(1);
		dq.addFirst(2);
		dq.add(3); // adds at last 
		dq.addLast(4);
		System.out.println(dq);
		System.out.println("front ele: " + dq.peek());
		System.out.println("front ele: " + dq.peekFirst());
		System.out.println("rear ele: " + dq.peekLast());
		
		dq.poll(); // removes from front
		System.out.println(dq);
		dq.pollFirst();  // removes from front
		System.out.println(dq);
		dq.pollLast(); // removes from rear
		System.out.println(dq);
		
		dq.addFirst(4);
		dq.addFirst(0);
		dq.addLast(6);
		System.out.println(dq);
		
		dq.removeFirst(); // removes from front
		System.out.println(dq);
		dq.removeLast(); // removes from rear
		System.out.println(dq);
		dq.remove(); // removes from front
		System.out.println(dq);
	}
}

