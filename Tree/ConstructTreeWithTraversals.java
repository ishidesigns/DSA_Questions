package DSA_Interview_Questions.Tree;

public class ConstructTreeWithTraversals
{
	static int preidx = 0;
	public static void main(String[] args) {
		int[] preorder = new int[]{1,2,4,5,3,6,7};
		int[] inorder = new int[]{4,2,5,1,6,3,7};
		
		Node root = construct(preorder, inorder, 0, preorder.length - 1);
		inorderTraversal(root);
	}
	
	public static void inorderTraversal(Node root)
	{
		if(root != null)
		{
			inorderTraversal(root.left);
			System.out.print(root.val + " ");
			inorderTraversal(root.right);
		}
	}
	
	public static Node construct(int[] preorder, int[] inorder, int s, int e)
	{
		if(s > e)
			return null;
		
		
		Node root = new Node(preorder[preidx++]);
		if(s == e)
			return root;
		
		int inidx = search(inorder, root.val, s, e);
		
		root.left = construct(preorder, inorder, s, inidx - 1);
		root.right = construct(preorder, inorder, inidx + 1, e);
		return root;
	}
	
	public static int search(int[] arr, int num, int s, int e)
	{
		int i;
		for(i = s; i <= e; i++)
		{
			if(arr[i] == num)
				return i;
		}
		return i;
	}
}
