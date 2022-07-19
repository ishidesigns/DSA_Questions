package Tree;

import java.util.ArrayList;
import java.util.List;

public class BoundaryTraversal 
{
	static List<Integer> list, list2;
	public static void main(String[] args) {
		
		/*
				  5
				/   \
			   3     1
			  / \   / \
			 2   6 4   8      
		*/
//		Node root = new Node(5);
//		CreateTree ct = new CreateTree();
//		ct.create(root);
		
		Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(7);
        root.left.left = new Node(3);
        root.right.right = new Node(8);
        root.left.left.right = new Node(4);
        root.right.right.left = new Node(9);
        root.left.left.right.left = new Node(5);
        root.left.left.right.right = new Node(6);
        root.right.right.left.right = new Node(11);
        root.right.right.left.left = new Node(10);
		
		list = new ArrayList<>();
		list2 = new ArrayList<>();
		addNodes(root);
		
		for(int i = list2.size() - 1; i >= 1; i--)
		{
			list.add(list2.get(i));
		}
		for(int i : list)
		{
			System.out.print(i + " ");
		}
	}
	
	static void addNodes(Node root)
	{
		if(root == null) return;
		
		addLeftNodes(root, 0);
		addLeafNodes(root);
		addRightNodes(root, 0);
	}
	
	static void addLeftNodes(Node root, int level) {
		if(root == null)
			return;
			
		if(level == list.size()) 
		{
			if(!isLeaf(root))
				list.add(root.val);
		}
		
		if(root.left != null)
			addLeftNodes(root.left, level + 1);
		else if(root.right != null)
			addLeftNodes(root.right, level + 1);
	}
	
	static void addLeafNodes(Node root) 
	{
		if(root == null)
			return;
		
		if(isLeaf(root))
            list.add(root.val);
		
        if(root.left != null)
        	addLeafNodes(root.left);
        
        if(root.right != null)
        	addLeafNodes(root.right);
        
	}
	
	static void addRightNodes(Node root, int level)
	{
		if(root == null)
			return;
		
		if(level == list2.size())
			if(!isLeaf(root))
				list2.add(root.val);
		if(root.right != null)
			addRightNodes(root.right, level + 1);
		else if(root.left != null)
			addRightNodes(root.left, level + 1);
	}
	
	static boolean isLeaf(Node cur)
	{
		if(cur == null)
			return false;
		
		else if(cur.left == null && cur.right == null){
            return true;
        }
        else{
            return false;
        }
    }
	
	
}
