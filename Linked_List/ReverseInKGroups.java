package DSA_Interview_Questions.Linked_List;

public class ReverseInKGroups 
{
	public static void main(String[] args) 
	{
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);
		head.next.next.next.next.next = new Node(6);
		int k = 2;
		reverseK(head, k);
		printList(head);
	}
	
	public static void reverseK(Node head,int k)
	{
		int len = getLength(head);
		int groups = len / k;
	}
	
	public static int getLength(Node head)
	{
		int count = 0;
		if(head == null)
			return 0;
		
		while(head != null)
		{
			count++;
			head = head.next;
		}
		
		return count;
	}
	
	public static void printList(Node head)
	{
		while(head != null)
		{
			System.out.print(head.val + " -> ");
			head = head.next;
		}
		System.out.println("null");
	}
}
