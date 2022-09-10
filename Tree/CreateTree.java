package Tree;

public class CreateTree 
{
	
	public static void main(String[] args) {
		Node root = new Node(15);
		create(root);
	}
	
	static void create(Node root) {
		Node rl = new Node(3);
		Node rr = new Node(1);
		root.left = rl;
		root.right = rr;
		
		Node rll = new Node(2);
		Node rlr = new Node(6);
		rl.left = rll;
		rl.right = rlr;
		
		Node rrl = new Node(4);
		Node rrr = new Node(8);
		rr.left = rrl;
		rr.right = rrr;
	}
}
