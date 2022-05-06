package DSA_Interview_Questions.Linked_List;

public class ReversingAndLengthOfLL 
{
	public static void main(String[] args) 
	{
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		
		System.out.print("LL in Beginning: ");
		printList(head);
		
		reverse(head);
		
		int len = getLength(head);
		System.out.println("\nSize of LL: " + len);
		
	}
	
	// Length of Linked List
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
	
	// Reversing Linked List
	static Node reverse(Node head)
	{
		Node curr = head;
		Node prev = null;
		Node nxt = null;
        while(curr != null)
        {
            nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }
        
        System.out.print("\nLL after reversing: ");
		printList(prev);
        
        return prev;
	}
}
