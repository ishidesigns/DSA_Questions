package DSA_Interview_Questions.Stack;

import java.util.*;

public class StackUsingQueue 
{
	Queue<Integer> qu;
    int size;
    public StackUsingQueue() 
    {
        qu = new LinkedList<Integer>();
        this.size = 0;
    }
	public static void main(String[] args) 
	{
		StackUsingQueue st = new StackUsingQueue();
		st.push(0);
		st.push(4);
		System.out.println(st.empty());
		st.top();
		st.pop();
		st.top();
		st.pop();
		System.out.println(st.empty());
	}
	
	public void push(int x) 
    {
        Queue<Integer> temp = new LinkedList<>();
        if(qu.isEmpty())
            qu.add(x);
        else
        {
            while(!qu.isEmpty())
                temp.add(qu.poll());
            
            qu.add(x);
            
            while(!temp.isEmpty())
                qu.add(temp.poll());
            
            size++;
        }
    }
    public void pop() 
    {
        if(!qu.isEmpty())
        {
            size--;
            qu.poll();
        }
        else
        	System.out.println("Queue Is Empty");
            
    }
    public void top() {
        if(!qu.isEmpty())
            System.out.println( qu.peek());
        else
        {
            System.out.println("Queue Is Empty");
        }
    }
    public boolean empty() 
    {
          return qu.isEmpty();
    }
}