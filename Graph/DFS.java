package DSA_Interview_Questions.Graph;

public class DFS 
{
	static int n;
	static int[] arr;
	static boolean[] visited;
	public static void main(String[] args) 
	{
		n = 10000007;
		arr = new int[n];
		visited = new boolean[n];
		
	}
	
	static void dfs(int curr) {
		// TC: O(V+E)
		visited[curr] = true;
		for(int i : arr) {
			if(visited[i])
				continue;
			
			dfs(i);
		}
	}
	
}
