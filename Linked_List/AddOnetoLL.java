package DSA_Interview_Questions.Linked_List;
public class AddOnetoLL 
{
	public static void main(String[] args) 
	{
		Node head = new Node(9);
		head.next = new Node(9);
		head.next.next = new Node(9);
		// head = addOne_1(head);
		head = addOne_2(head);
		printList(head);
		
		Node head2 = new Node(3);
		head2.next = new Node(5);
		head2.next.next = new Node(6);
		head2 = addOne_1(head2);
		printList(head2);
	}
	
	static void printList(Node head)
	{
		while(head != null)
		{
			System.out.print(head.val + " --> ");
			head = head.next;
		}
		System.out.println("null");
	}
	
	static Node reverseLL(Node head)
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
	    return prev;
	}
	
	// Method 1
	static Node addOne_1(Node head)
	{
		head = reverseLL(head);
		Node temp = head;
	    if(temp.val == 9)
	    {
	        int carry = 1;
	        temp.val = 0;
	        while(temp.next != null && carry == 1)
	        {
	            temp = temp.next; 
	            if(temp.val == 9)
	            {
	                temp.val = 0;
	                carry = 1;
	            }
	            else
	            {
	                temp.val += 1;
	                carry = 0;
	            }
	        }
	        if(carry == 1)
	        {
	            Node extra = new Node(1);
	            temp.next = extra;
	        }
	        head = reverseLL(head);
	        return head;
	    }
	    else 
	    {
	        temp.val += 1;
	        head = reverseLL(head);
	        return head;
	    }
	}
	
	// Method 2
	static Node addOne_2(Node head)
	{
		head = reverseLL(head);
		Node temp = head;
		Node prev = null;
		int carry = 1, sum = 0;
		
		while(temp != null)
		{
			sum = temp.val + carry;
			temp.val = sum % 10;
			carry = sum / 10;
			prev = temp;
			temp = temp.next;
		}
		if(carry != 0)
		{
			prev.next = new Node(carry);
		}
		head = reverseLL(head);
	    return head;
	}
}