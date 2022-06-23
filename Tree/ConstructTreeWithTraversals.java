package DSA_Interview_Questions.Tree;

public class ConstructTreeWithTraversals
{
	static int preidx = 0, preidx2, len;
	public static void main(String[] args) {
		int[] preorder = new int[]{1,2,4,5,3,6,7};
		int[] inorder = new int[]{4,2,5,1,6,3,7};
		int[] postorder = new int[] {4,5,2,6,7,3,1};
		
		len = preorder.length;

		Node root = construct_pre_in(preorder, inorder, 0, len - 1);
		System.out.print("Inorder Traversal of the tree constructed using Inorder and Preorder: ");
		inorderTraversal(root);
		
		Node root2 = construct_pre_post(preorder, postorder, len);
		System.out.print("\nInorder Traversal of the tree constructed using Postorder and Preorder: ");
		inorderTraversal(root2);
		
		Node root3 = construct_post_in(postorder, inorder, 0, len - 1, 0, len - 1);
		System.out.print("\nInorder Traversal of the tree constructed using Postorder and Inorder: ");
		inorderTraversal(root3);
	}
	
	// constructing tree with preorder and inorder
	public static Node construct_pre_in(int[] preorder, int[] inorder, int s, int e)
	{
		if(s > e)
			return null;
		
		Node root = new Node(preorder[preidx++]);
		
		if(s == e)
			return root;
		
		// searching index of root in inorder array
		int inidx = -1; // 5
		for(int i = s; i <= e; i++)
		{
			if(inorder[i] == root.val)
			{
				inidx = i;
				break;
			}
		}
		
		root.left = construct_pre_in(preorder, inorder, s, inidx - 1);
		root.right = construct_pre_in(preorder, inorder, inidx + 1, e);
		return root;
	}
	
	
	// constructing tree with preorder and postorder
	public static Node construct_pre_post(int[] preorder, int[] postorder, int len)
	{
		preidx2 = 0;
		return construct_tree_pre_post(preorder, postorder, 0, len - 1);
	}
	public static Node construct_tree_pre_post(int[] preorder, int[] postorder, int s, int e)
	{
		if(s > e || preidx2 >= len)
			return null;
		Node root = new Node(preorder[preidx2++]);
		
		if(s == e || preidx2 >= len)
			return root;
		
		// searching index of root's next in postorder array
		int postidx = -1;
		for(int i = s; i <= e; i++)
		{
			if(postorder[i] == preorder[preidx2])
			{
				postidx = i;
				break;
			}
		}
		
		root.left = construct_tree_pre_post(preorder, postorder, s, postidx);
		root.right = construct_tree_pre_post(preorder, postorder, postidx + 1, e - 1);
		
		return root;
	}
	
	
	// constructing tree with postorder and inorder
	public static Node construct_post_in(int[] postorder, int[] inorder, int is, int ie, int ps, int pe)
	{
		if(is > ie)
			return null;
		
		Node root = new Node(postorder[pe]);
		if(is == ie)
			return root;
		
		// searching index of root in inorder array
		int inidx = 0;
		for(int i = is; i <= ie; i++)
		{
			if(inorder[i] == root.val)
			{
				inidx = i;
				break;
			}
		}
		
		root.left = construct_post_in(postorder, inorder, is, inidx - 1, ps, ps - is + inidx - 1);
		root.right = construct_post_in(postorder, inorder, inidx + 1, ie, pe - ie + inidx, pe - 1);
		
		return root;
	}
	
	// Inorder Traversal 
	public static void inorderTraversal(Node root)
	{
		if(root != null)
		{
			inorderTraversal(root.left);
			System.out.print(root.val + " ");
			inorderTraversal(root.right);
		}
	}
}
