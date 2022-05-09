package DSA_Interview_Questions.Stack;

import java.util.*;

public class StackDemo 
{
	public static void main(String[] args) 
	{
		// LIFO order -> Last In First Out
		Stack<Integer> st = new Stack();
		
		// empty stack 
		System.out.println(st.isEmpty()); // stack is empty -> true
		st.push(1); // add element to stack
		System.out.println(st.isEmpty()); // stack is empty -> false 
		st.push(2);
		st.push(3);
		
		System.out.println(st);
		
		System.out.println(st.peek()); // top element in stack 
		
		st.pop(); // remove element from top of stack
		System.out.println(st);
		st.pop();
		st.pop();
		System.out.println(st);
		// st.pop(); // EmptyStackException
	}
}