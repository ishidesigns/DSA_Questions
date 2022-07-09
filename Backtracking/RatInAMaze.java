package DSA_Interview_Questions.Backtracking;

import java.util.*;
public class RatInAMaze 
{
	public static void solve(int i, int j, int[][] m, int n, ArrayList<String> al, String move, int[][] vis)
	{
        if (i == n - 1 && j == n - 1) 
        {
        	al.add(move);
        	return;
        }
        
        if (i + 1 < n && vis[i + 1][j] == 0 && m[i + 1][j] == 1) {
	        vis[i][j] = 1;
	        solve(i + 1, j, m, n, al, move + 'D', vis);
	        vis[i][j] = 0;
        }
        
        if (j - 1 >= 0 && vis[i][j - 1] == 0 && m[i][j - 1] == 1) {
	       vis[i][j] = 1;
	       solve(i, j - 1, m, n, al, move + 'L', vis);
	       vis[i][j] = 0;
        }
        
        if(j + 1 < n && vis[i][j + 1] == 0 && m[i][j + 1] == 1){
            vis[i][j] = 1;
            solve(i, j + 1, m, n, al, move + "R", vis);
            vis[i][j] = 0;
        }
        
        
        if(i - 1 >= 0 && vis[i - 1][j] == 0 && m[i - 1][j] == 1){
            vis[i][j] = 1;
            solve(i - 1, j, m, n, al, move + "U", vis);
            vis[i][j] = 0;
        }
    }
    public static ArrayList<String> findPath(int[][] m, int n) {
        // Your code here
        int vis[][] = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                vis[i][j] = 0;
            }
        }
        ArrayList<String> al = new ArrayList<>();
        if(m[0][0] == 1)
        	solve(0, 0, m, n, al, "", vis);
        return al;
    }
    
    public static void main(String[] args) {
		int[][] mat = new int[4][4];
		mat[0][0] = 1;
		mat[1][0] = 1;
		mat[1][1] = 1;
		mat[1][3] = 1;
		mat[2][0] = 1;
		mat[2][1] = 1;
		mat[3][1] = 1;
		mat[3][2] = 1;
		mat[3][3] = 1;
		
		ArrayList<String> list = findPath(mat, 4);
		for(String s : list)
			System.out.print(s + " ");
	}
}
