package DSA_Interview_Questions.Tree;

import java.util.*;


class Pair{
	int h_dist;
	Node newNode;
	Pair(Node newNode, int h_dist)
	{
		this.h_dist = h_dist;
		this.newNode = newNode;
	}
}
public class ViewsOfTree
{
	static List<Integer> list, list2;
	public static void main(String[] args) 
	{
		/*
				  5
				/   \
			   3     1
			  / \   / \
			 2   6 4   8      
		*/
		
		
		Node root = new Node(5);
		CreateTree ct = new CreateTree();
		ct.create(root);
		
		System.out.print("Top View: ");
		topView(root);
		System.out.println();
		
		System.out.print("Bottom View: ");
		bottomView(root);
		System.out.println();
		
		System.out.print("Right View: ");
		rightView1(root);
		System.out.println();
		
		System.out.print("Right View (Optimized): ");
		list = new ArrayList<>();
		rightView2(root, 0);
		for(int i : list)
			System.out.print(i + " ");
		System.out.println();
		
		System.out.print("Left View (Optimized): ");
		list2 = new ArrayList<>();
		leftView(root, 0);
		for(int i : list2)
			System.out.print(i + " ");
		
	}
	
	// Top View
	static void topView(Node root)
	{
		if(root == null)
			return;
		
		Map<Integer, Integer> map = new TreeMap<>();
		Queue<Pair> q = new LinkedList<>();
		q.add(new Pair(root, 0));
		while(!q.isEmpty())
		{
			Pair p = q.poll();
			Node curr = p.newNode;
			int hd = p.h_dist;
			
			if(map.get(hd) == null)
				map.put(hd, curr.val);
			
			if(curr.left != null)
				q.add(new Pair(curr.left, hd - 1));
			
			if(curr.right != null)
				q.add(new Pair(curr.right, hd + 1));
		}
		for(int i : map.values())
			System.out.print(i + " ");
	}
	
	// Bottom View
	static void bottomView(Node root)
	{
		if(root == null)
			return;
		
		Map<Integer, Integer> map = new TreeMap<>();
		Queue<Pair> q = new LinkedList<>();
		q.add(new Pair(root, 0));
		while(!q.isEmpty())
		{
			Pair p = q.poll();
			Node curr = p.newNode;
			int hd = p.h_dist;
			
			map.put(hd, curr.val);
			
			if(curr.left != null)
				q.add(new Pair(curr.left, hd - 1));
			
			if(curr.right != null)
				q.add(new Pair(curr.right, hd + 1));
		}
		for(int i : map.values())
			System.out.print(i + " ");
	}
	
	// right View with TC : O(n) and SC : O(height of tree)
	static void rightView1(Node root)
	{
        if(root == null) 
        	return;
        List<Integer> list = new ArrayList<>();
        Queue<Node> q = new  LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            int size = q.size();
            for(int i = 0; i < size; i++)
            {
                Node node = q.poll();
                if(i == size - 1)
                    list.add(node.val);

                if(node.left != null)
                    q.add(node.left);

                if(node.right != null)
                    q.add(node.right);
            }
        }
        for(int i : list)
        	System.out.print(i + " ");
	}
	
	// Optimized Approach
	static void rightView2(Node root, int level)
	{
		if(root == null)
			return;
		
		if(level == list.size())
			list.add(root.val);
		
		rightView2(root.right, level + 1);
		rightView2(root.left, level + 1);
	}
	
	// Left View
	static void leftView(Node root, int level)
	{
		if(root == null)
			return;
		
		if(level == list2.size())
			list2.add(root.val);
		
		leftView(root.left, level + 1);
		leftView(root.right, level + 1);
	}
}
