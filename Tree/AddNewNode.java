package DSA_Interview_Questions.Tree;

import java.util.*;

public class AddNewNode
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
			System.out.print(root.val + " ");
			printTree(root.left);
			printTree(root.right);
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
