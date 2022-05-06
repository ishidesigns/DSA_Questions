package DSA_Interview_Questions.Queue;

public class QueueUsingArray 
{
	static int[] arr = new int[3];
	static int front = 0, rear = 0;
	
	public static void main(String[] args) 
	{
		System.out.println(isEmpty());
		enqueue(4);
		enqueue(7);
		enqueue(5);
		enqueue(8);
		print();
		peek();
		dequeue();
		peek();
		dequeue();
		peek();
		dequeue();
		peek();
	}
	
	static boolean isEmpty()
	{
		if(front >= rear)
			return true;
		return false;
	}
	
	static void enqueue(int x)
	{
		if(rear < arr.length)
			arr[rear++] = x;
		else
			System.out.println("Queue is full");
	}
	
	static void dequeue()
	{
		if(front >= rear)
			System.out.println("Queue is empty");
		else
			front++;
	}
	
	static void print()
	{
		for(int i = front; i < rear; i++)
			System.out.print(arr[i] + " ");
		
		System.out.println();
	}
	
	static void peek()
	{
		if(front >= rear)
			System.out.println("Queue is empty");
		else
			System.out.println(arr[front]);
	}
}