package DSA_Interview_Questions.Linked_List;

public class DeletionINSingleLL 
{
	public static void main(String[] args) {
		Node head = null;
		deleteAtBegin(head); // head linked list is empty
		deleteAtEnd(head);
		deleteMiddleNode(head);
		deleteNthNodeFromEnd(head, 1);
		
		Node head2 = new Node(1);
		head2.next = new Node(2);
		head2.next.next = new Node(3);
		head2.next.next.next = new Node(4);
		head2.next.next.next.next = new Node(5);
		
		System.out.print("LL in Beginning: ");
		printList(head2);
		
		deleteMiddleNode(head2);
		
		head2 = deleteAtBegin(head2);
		
		head2 = deleteAtEnd(head2);
		System.out.print("\nLL after deletion at end: ");
		printList(head2);
		head2 = deleteNthNodeFromEnd(head2, 2);
		head2 = deleteNthNodeFromEnd(head2, 1);
	}
	
	// printing Linked List
	static void printList(Node head)
	{
		Node temp = head;
		while(temp != null)
		{
			System.out.print(temp.val + " --> ");
			temp = temp.next;
		}
		
		System.out.println("null");
	}
	
	// Deletion at beginning
	static Node deleteAtBegin(Node head)
	{
		if(head == null)
		{
			System.out.println("Linked List is Empty\n");
			return head;
		}
		else
			head = head.next;
		
		System.out.print("\nLL after deletion at begining: ");
		printList(head);
		return head;
	}
	
	// Deletion at end
	static Node deleteAtEnd(Node head)
	{
		if(head == null)
		{
			System.out.println("Linked List is Empty\n");
			return head;
		}
		if(head.next == null)
		{
			head = null;
		}
		else
		{
			Node temp = head;
			Node prev = null;
			while(temp.next != null)
			{
				prev = temp;
				temp = temp.next;
			}
			prev.next = null;
		}
		return head;
	}
	
	static Node deleteNthNodeFromEnd(Node head, int n)
	{
		if(head == null)
		{
			System.out.println("Linked List is Empty\n");
			return head;
		}
		Node temp = head;
		Node curr = head;
		System.out.print("\nLL after deletion of "+ n +"th node from end: ");
		n = getLength(head) - n + 1;
		if(n == 1)
		{
			head = head.next;
		}
		else
		{
			for(int i = 0; i < n; i++)
			{
				if(curr.next == null)
				{
					if(i == n - 1)
						head = head.next;
					return head;
				}
				curr = curr.next;
			}
			
			while(curr.next != null)
			{
				temp = temp.next;
				curr = curr.next;
			}
		
			temp.next = temp.next.next;
		}
		printList(head);
		return head;
	}
	
//	Length of Linked List
	static int getLength(Node head)
	{
		if(head == null)
			return 0;
		
		int len = 1;
		Node cur = head;
		while(cur.next != null) 
		{
			len++; 
			cur = cur.next;
		}
		return len;
	}
	
//	Deletion of middle node of linked list
	
//	Method 1
//	static Node deleteMiddleNode(Node head)
//	{
//		int len = getLength(head);
//		int mid = len / 2;
//		if(len == 1)
//			head = new Node(-1);
//		
//		else if(len % 2 == 0)
//		{
//			Node temp = head;
//			Node prev = null;
//			int i = 1;
//			while(i < mid + 1)
//			{
//				prev = temp;
//				temp = temp.next;
//				i++;
//			}
//			prev.next = temp.next;	
//		}
//		else
//		{
//			Node temp = head;
//			Node prev = null;
//			int i = 1;
//			while(i < mid + 1)
//			{
//				prev = temp;
//				temp = temp.next;
//				i++;
//			}
//			prev.next = temp.next;
//		}
//		System.out.print("\nLL after deleting Middle node: ");
//		printList(head);
//	}
	

	
	// Method 2
	static Node deleteMiddleNode(Node head)
	{
		if(head == null)
		{
			System.out.println("Linked List is Empty\n");
			return head;
		}
		Node slow = head;
		Node fast = head;
		Node prev = null;
		while(fast != null && fast.next != null)
		{
			fast = fast.next.next;
			prev = slow;
			slow = slow.next;
		}
		prev.next = slow.next;
		System.out.print("\nLL after deleting Middle node: ");
		printList(head);
		return head;
	}
}
