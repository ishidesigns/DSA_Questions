package DSA_Interview_Questions.Tree;

import java.util.*;

public class VerticalTraversal 
{
	static Map<Integer, TreeMap<Integer, ArrayList<Integer>>> map;
	public static void main(String[] args) {
		/*
				 15
				/  \
			   3    1
			  / \  / \
			 /   \4   8
			2     6
			     
		SC : O{n)
		TC : O(n)
		*/
		
		
		Node root = new Node(15);
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
		map = new TreeMap<>();
		verticalOrder(root);
	}
	
	static void verticalOrder(Node root)
	{
		if(root == null)
			return; 
		List<ArrayList<Integer>> ansList = new ArrayList<>();
		traverse(root, 0, 0);
		
		for(TreeMap<Integer, ArrayList<Integer>> innerMap : map.values())
		{
			ArrayList<Integer> mapList = new ArrayList<>();
			for(ArrayList<Integer> innerMapList : innerMap.values())
			{
				Collections.sort(innerMapList);
				
				for(Integer innerMapListNums : innerMapList)
					mapList.add(innerMapListNums);
			}
			ansList.add(mapList);
		}
		
		System.out.println(ansList);
	}
	
	static void traverse(Node root, int v, int h)
	{
		if(root == null)
			return;
		
		if(!map.containsKey(h))
			map.put(h, new TreeMap<>());
		
		if(!map.get(h).containsKey(v))
			map.get(h).put(v, new ArrayList<>());
		
		map.get(h).get(v).add(root.val);
		traverse(root.left, v+1, h-1);
		traverse(root.right, v+1, h+1);
	}
}