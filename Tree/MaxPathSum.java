package DSA_Interview_Questions.Tree;

public class MaxPathSum 
{
	public static void main(String[] args) {
		CreateTree ct = new CreateTree();
		Node root = new Node(5);
		ct.create(root);
		int ans = maxSum(root);
		System.out.print(ans);
	}
	
	static int maxSum(Node root) {
		if(root == null) return 0;
		
		int leftSum = maxSum(root.left);
		int rightSum = maxSum(root.right);
		
		return root.val + Math.max(leftSum, rightSum);
	}
}
