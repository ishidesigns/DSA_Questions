package DSA_Interview_Questions.Tree;

public class BinaryTreeTraversals
{
	public static void main(String[] args) {
		/*
				  5
				/   \
			   3     7
			  / \   / \
			 2   4 6   8
		*/
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
	    Node rrr = new Node(8);
	    rr.left = rrl;
	    rr.right = rrr;
	    
	    inorder(root);
	    System.out.println();
	    preorder(root);
	    System.out.println();
	    postorder(root);
	    
	}
	
	static void inorder(Node root)
	{
		if(root == null)
			return;
		else
		{
			inorder(root.left);
			System.out.print(root.val + " ");
			inorder(root.right);
		}
	}
	
	static void preorder(Node root)
	{
		if(root == null)
			return;
		else
		{
			System.out.print(root.val + " ");
			preorder(root.left);
			preorder(root.right);
		}
	}
	
	static void postorder(Node root)
	{
		if(root == null)
			return;
		else
		{
			postorder(root.left);
			postorder(root.right);
			System.out.print(root.val + " ");
		}
	}
}

