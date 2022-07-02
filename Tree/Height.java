package DSA_Interview_Questions.Tree;

public class Height 
{
	public static void main(String[] args) {
		Node root = new Node(1);
        
        root.left = new Node(2);
        root.right = new Node(3);
        
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        
        System.out.print("Height : " + height(root));
	}
	
	static int height(Node root)
    {
        if(root == null) return 0;
        
        int left_height = height(root.left);
        int right_height = height(root.right);
        
        return Math.max(left_height, right_height) + 1;
    }
}
