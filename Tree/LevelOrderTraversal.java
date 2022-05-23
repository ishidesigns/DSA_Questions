package DSA_Interview_Questions.Tree;

import java.util.*;

public class LevelOrderTraversal 
{
	public static void main(String[] args) 
	{
		Node root = new Node(5);
	    Node rl = new Node(3);
	    Node rr = new Node(7);
	    root.left = rl;
	    root.right = rr;
	    
	    Node rll = new Node(2);
	    Node rlr = new Node(4);
	    rl.left = rll;
	    rl.right = rlr;
	    
	    Node rrl = new Node(6);
	    rr.left = rrl;
	    
	    printLevelOrder(root);
	}
	
	public static void printLevelOrder(Node root)
	{
		List<ArrayList<Integer>> anslist = new ArrayList<>();
		if(root == null)
			return;
		
		else
		{
			Queue<Node> q = new LinkedList<>();
			q.offer(root);
			
			while(!q.isEmpty())
			{
				int len = q.size();
				ArrayList<Integer> list = new ArrayList<>();
				for(int x = 0; x < len; x++)
				{
					Node front = q.peek();
					if(front.left != null)
						q.offer(front.left);
					
					if(front.right != null)
						q.offer(front.right);
					
					list.add(q.poll().val);
				}
				for(int i : list)
					System.out.print(i + " ");
				System.out.println();
			}
		}
	}
}
