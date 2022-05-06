package DSA_Interview_Questions.Linked_List;

import java.util.*;

public class InsertValues_InLL_FromArray 
{
	static Node head = null;
	static void insert(int[] arr)
	{
		int n = arr.length;
		Node newNode = null;
		for(int i = 0; i < n; i++)
		{
			newNode = new Node(arr[i]);
			if(head == null)
			{
				head = newNode;
			}
			else
			{
				Node curr = head;
				while(curr.next != null)
				{
					curr = curr.next;
				}
				curr.next = newNode;
			}
		}
	}
	
	static void printList(Node head)
	{
		Node curr = head;
		while(curr != null)
		{
			System.out.print(curr.val + " -> ");
			curr = curr.next;
		}
		System.out.print("null\n");
	}
	
	public static void main(String[] args) 
	{
		int[] arr = new int[] {1, 2, 3, 7, 0};
		
		insert(arr);
		printList(head);
	}
}
