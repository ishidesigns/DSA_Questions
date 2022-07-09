package Graph;

import java.util.*;

public class BFS {
	public static ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {

        ArrayList<Integer> bfs = new ArrayList<>();
        boolean vis[] = new boolean[V];
        Queue<Integer> q = new LinkedList<>();

        q.add(0);
        vis[0] = true;

        while(!q.isEmpty()) {
            Integer node = q.poll();
            bfs.add(node);

            for(Integer i : adj.get(node)) {
                if (vis[i] == false) {
                    vis[i] = true;
                    q.add(i);
                }
            }
        }

        return bfs;
    }

    static void printAns(ArrayList < Integer > ans) {
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
    }
    public static void main(String args[]) {

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            adj.add(new ArrayList<>());
        }
        adj.get(0).add(1);
        adj.get(1).add(0);
        adj.get(0).add(2);
        adj.get(2).add(0);
        adj.get(0).add(3);
        adj.get(3).add(0);
        adj.get(2).add(4);
        adj.get(4).add(2);
        System.out.println(adj);

        ArrayList<Integer> ans = bfsOfGraph(5, adj);
        printAns(ans);
    }
}
