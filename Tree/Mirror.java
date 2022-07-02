package DSA_Interview_Questions.Tree;

import java.util.*;

public class Mirror {
	public static void main(String[] args) {
		Node root = new Node(1);
        
        root.left = new Node(2);
        root.right = new Node(3);
        
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        
        System.out.println("\nLevel order original: ");
        levelOrder(root);
        
        Node root1 = mirror(root);
        System.out.println("\nLevel order mirror: ");
        levelOrder(root1);
	}
	
	static Node mirror(Node root){
        if(root == null)
            return root;
            
        Node left = mirror(root.left);
        Node right = mirror(root.right);
        
        root.left = right;
        root.right = left;
        
        return root;
    }
	
	static void levelOrder(Node root)
    {
        if(root == null) return;
        
        Queue<Node> qu = new LinkedList<>();
        qu.offer(root);
        
        while(!qu.isEmpty())
        {
            int size = qu.size();
            
            for(int i = 0; i < size; i++)
            {
                if(qu.peek().left !=  null)
                    qu.offer(qu.peek().left);
                    
                if(qu.peek().right !=  null)
                    qu.offer(qu.peek().right);
                    
                System.out.print(qu.poll().val + " ");
            }
            System.out.println();
        }
    }
}
