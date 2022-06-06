package DSA_Interview_Questions.Tree;

import java.util.*;

public class LevelOrderTraversal
{
	public static void main(String[] args) {
		Node root = null;
		root = addNode(root, 5);
	    addNode(root, 3);
	    addNode(root, 7);
	    addNode(root, 2);
	    addNode(root, 4);
	    addNode(root, 6);
	    printTree(root);
	}
	
	static void printTree(Node root)
	{
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
	
	static Node addNode(Node root, int n)
	{
		Node newNode = new Node(n);
		if(root == null)
		{
			root = newNode;
		}
		else
		{
			Queue<Node> q = new LinkedList<>();
			q.add(root);
			while(!q.isEmpty())
			{
				Node front = q.poll();
				if(front.left == null)
				{
					front.left = newNode;
					return root;
				}
				else
					q.add(root.left);
				
				
				if(front.right == null)
				{
					front.right = newNode;
					return root;
				}
				else
					q.add(root.right);
			}
		}
		return root;
	}
}
