package DSA_Interview_Questions.Stack;

public class StackUsingLL 
{
	static int size;
	static Node topEle;
	public static void main(String[] args) {
		length();
		top();
		isEmpty();
		push(5);
		push(4);
		pop();
		top();
		length();
		isEmpty();
		pop();
		top();
		length();
	}
	
	static void push(int x)
	{
		Node newNode = new Node(x);
	    newNode.next = topEle;
	    topEle = newNode;
	    size++;
	}
	
	static void length()
	{
		System.out.println(size);
	}
	
	static void isEmpty()
	{
		if(size == 0)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
	public static void top()
	{
		if(size == 0)
			System.out.println("Stack is empty");
		else
		{
			Node temp = topEle;
			while(temp.next != null)
			{
				temp = temp.next;
			}
			System.out.println(temp.val);
		}
	}
	
	static void pop()
	{
		if(topEle == null)
		{
			System.out.println("Stack underflow");
			return;
		}
		if(size == 1)
		{
			topEle = topEle.next;
		}
		else
		{
			Node temp = topEle;
			Node prev = null;
			while(temp.next != null)
			{
				prev = temp;
				temp = temp.next;
			}
			prev.next = null;
		}
		size--;
	}
}
