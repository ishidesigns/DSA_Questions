package DSA_Interview_Questions.Linked_List;

public class CycleInLL 
{
	public static void main(String[] args) {
		Node first = new Node(1);
		Node sec = new Node(2);
		Node third = new Node(3);
		Node fourth = new Node(4);
		Node fifth = new Node(5);
		
		first.next = sec;
		sec.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = sec;
		
		cycle(first);
		
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		cycle(head);
	}
	
	static void cycle(Node head)
	{
		Node slow = head;
		Node fast = head;
		boolean flag = false;
		while(slow != null && fast != null && fast.next != null)
		{
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast)
			{
				flag = true;
				break;
			}
		}
		if(flag)
			System.out.println("\nLoop present ");
		else
			System.out.println("\nLoop not present");
	}
}
