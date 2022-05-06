package DSA_Interview_Questions.Linked_List;

public class Merge2SortedLL 
{
	public static void main(String[] args) 
	{
		Node head1 = new Node(1);
		head1.next = new Node(2);
		head1.next.next = new Node(4);
		
		Node head2 = new Node(2);
		head2.next = new Node(3);
		head2.next.next = new Node(3);
		
		printList(head1);
		printList(head2);
		Node res = mergeLL(head1, head2);
		printList(res);
	}
	
	static Node mergeLL(Node head1, Node head2)
	{
		Node temp1 = head1;
		Node temp2 = head2;
		Node prev = new Node(0);
		Node curr = prev;
		while(temp1 != null && temp2 != null)
		{
			if(temp1.val <= temp2.val)
			{
				curr.next = temp1;
				temp1 = temp1.next;
			}
			else
			{
				curr.next = temp2;
				temp2 = temp2.next;
			}
			curr = curr.next;
		}
		if(temp1 != null)
		{
			curr.next = temp1;
			temp1 = temp1.next;
			curr = curr.next;
		}
		if(temp2 != null)
		{
			curr.next = temp2;
			temp2 = temp2.next;
			curr = curr.next;
		}
		
		return prev.next;
	}
	
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
}
