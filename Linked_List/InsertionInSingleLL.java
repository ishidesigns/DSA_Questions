package DSA_Interview_Questions.Linked_List;

public class InsertionInSingleLL 
{
	public static void main(String[] args) 
	{
		Node head = null;
		System.out.print("LL in Beginning: ");
		printList(head);
		
		head = insertAtBegin(head, 10);
		head = insertAtBegin(head, 5);
		head = insertAtBegin(head, 3);
		
		head = insertAtEnd(head, 14);
		head = insertAtEnd(head, 6);
		
		head = insertAtPos(head, 1, 8);
		head = insertAtPos(head, 4, 7);
	}
	
	// Printing Linked List
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
	
	// Insertion at the beginning
	static Node insertAtBegin(Node head, int num)
	{
		Node newHead = new Node(num);
		newHead.next = head;
		head = newHead;
		System.out.print("\nLL after insertion of " + head.val +" at begining: ");
		printList(head);
		// this method requires returning head because new head is updated
		return head;
	}
	
	// Insertion at the end
	static Node insertAtEnd(Node head, int num)
	{
		Node newEnd = new Node(num);
		Node temp = head;
		if(head == null)
		{
			head = new Node(num);
		}
		else
		{
			while(temp.next != null) 
			{
				temp = temp.next;
			}
			temp.next = newEnd;
		}
		System.out.print("\nLL after insertion of " + newEnd.val +" at the end: ");
		printList(head);
		return head;
	}
	
	static Node insertAtPos(Node head, int pos, int num) 
	{
		Node temp = head;
		Node newNode = new Node(num);
		if(pos == 1)
		{
			Node newHead = new Node(num);
			newHead.next = head;
			head = newHead;
			System.out.print("\nLL after insertion of " + newNode.val + " at pos " + pos + ": ");
			printList(head);
			return head;
		}
		
		else
		{
			int i = 2;
			while(i < pos && temp != null)
			{
				temp = temp.next;
				i++;
			}
			
			newNode.next = temp.next;
			temp.next = newNode;
		}
		
		System.out.print("\nLL after insertion of " + newNode.val + " at pos " + pos + ": ");
		printList(head);
		return head;
	}
}
