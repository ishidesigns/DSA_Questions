package DSA_Interview_Questions.Tree;

public class LCA 
{
	public static void main(String[] args) {
		
		/*
				  1
				/   \
			   2     3
			  / \   / \
			 4   5 6   7
			/     /
		   8     10
		    \
		     9
		*/		

		Node root = new Node(1);
        
        root.left = new Node(2);
        root.right = new Node(3);
        
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        
        root.left.left.left  = new Node(8);
        root.right.left.left = new Node(10);
        root.left.left.left.right  = new Node(9);
        
        int num1 = 4, num2 = 9;
        Node lca = lowestCommonAncestor(root, num1, num2);
        System.out.print("LCA of " + num1 + " and " + num2 + " is: " + lca.val);
	}
	
	static Node lowestCommonAncestor(Node root, int a, int b)
	{
		if(root == null) 
			return root;
		
		if(root.val == a || root.val == b)
			return root;
		
		Node leftLCA = lowestCommonAncestor(root.left, a, b);
		Node rightLCA = lowestCommonAncestor(root.right, a, b);
		
		if(leftLCA != null && rightLCA != null)
			return root;
		
		if(leftLCA != null)
			return leftLCA;
		
		return rightLCA;
	}
}
