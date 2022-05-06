package DSA_Interview_Questions.Stack;

public class StackUsingArray 
{
	static int[] arr = new int[3];
	static int top = -1;
	public static void main(String[] args) 
	{
		top();
		push(3);
		push(7);
		top();
		isEmpty();
		push(6);
		size();
		print();
		pop();
		pop();
		pop();
		pop();
		
	}
	
	static void push(int x)
	{
		top++;
		if(top == arr.length)
		{
			System.out.println("Stack Overflow");
			return;
		}
		arr[top] = x;
	}
	
	static void pop()
	{
		if(top == -1)
		{
			System.out.println("Stack Underflow");
			return;
		}
		top--;
	}
	
	static void top()
	{
		if(top == -1)
		{
			System.out.println("Stack is Empty");
			return;
		}
		System.out.println(arr[top]);
	}
	
	static void isEmpty()
	{
		if(top == -1)
		{
			System.out.println("Yes");
		}
		else
			System.out.println("No");
	}
	
	static void size()
	{
		System.out.println(top + 1);
	}
	
	static void print()
	{
		for(int i = 0;i < top; i++)
			System.out.print(arr[i] + " ");
		
		System.out.println();
	}
}
