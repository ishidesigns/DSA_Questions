package DSA_Interview_Questions.Tree;
class TreeCreation
{
	public static void main(String[] args) {
		Node root = new Node(5);
	    root.left = new Node(3);
	    root.right = new Node(7);

	    System.out.println(" " + root.val + "\n/ \\");
	    System.out.print(root.left.val + " ");
	    System.out.println(root.right.val);
	}
}
