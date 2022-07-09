package Graph;

import java.util.*;

public class GraphRepresentation 
{
	public static void main(String[] args) {
		/*---------------------Adjacency Matrix-----------------------*/
		int[][] mat = new int[5][5];
		
		// edge 1-2, 1-4 
		mat[1][2] = 1;
		mat[1][4] = 1;
		mat[2][1] = 1;
		mat[4][1] = 1;
		
		// edge 2-3
		mat[2][3] = 1;
		mat[3][2] = 1;
		
		// edge 3-4
		mat[3][4] = 1;
		mat[4][3] = 1;
		System.out.println("Adjacency Matrix: ");
		for(int i = 0; i < 5; i++)
		{
			for(int j = 0; j < 5; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
		
		/*----------------------Adjacency List----------------------*/
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		for(int i = 0; i <= 5; i++)
			list.add(new ArrayList<Integer>());
		
		// edge 1-2
		list.get(1).add(2);
		list.get(2).add(1);
		
		// edge 1-4
		list.get(1).add(4);
		list.get(4).add(1);
		
		// edge 2-3
		list.get(2).add(3);
		list.get(3).add(2);
		
		// edge 3-4
		list.get(3).add(4);
		list.get(4).add(3);
		
		System.out.println("\nAdjacency List");
		for(int i = 1; i < 5; i++)
		{
			System.out.print(i + " -> ");
			for(int j = 0; j < list.get(i).size(); j++)
				System.out.print(list.get(i).get(j) + " ");
			
			System.out.println();
		}
	}
}
