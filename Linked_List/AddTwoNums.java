package DSA_Interview_Questions.Linked_List;

public class AddTwoNums 
{
	public static void main(String[] args) 
	{
		Node head1 = new Node(5);
		head1.next = new Node(8);
		head1.next.next = new Node(9);
		
		Node head2 = new Node(8);
		head2.next = new Node(2);
		head2.next.next = new Node(4);
		head2.next.next.next = new Node(6);
				
		Node res = addNums(head1, head2);
		res = reverse(res);
		printList(res);
	}
	
	static void printList(Node head)
	{
		Node temp = head;
		
		while(temp != null)
		{
			System.out.print(temp.val + " -> ");
			temp = temp.next;
		}
		System.out.println("null");
	}
	
	static Node addNums(Node head1, Node head2)
	{
		head1 = reverse(head1);
		head2 = reverse(head2);
		
		Node t1 = head1;
        Node t2 = head2;
        Node l3 = new Node(0);
        Node t3 = l3;
        int carry = 0;
        while(t1 != null || t2 != null || carry > 0)
        {
            if (t1 != null) {
                carry += t1.val;
                t1 = t1.next;
            }
            if (t2 != null) {
                carry += t2.val;
                t2 = t2.next;
            }
            
            t3.next = new Node(carry % 10);
            carry /= 10;
            t3 = t3.next;
        }
        return l3.next;
	}
	
	static Node reverse(Node head)
	{
		Node curr = head;
		Node prev = null, nxt = null;
		
		while(curr != null)
		{
			nxt = curr.next;
			curr.next = prev;
			prev = curr;
			curr = nxt;
		}
		return prev;
	}
}
