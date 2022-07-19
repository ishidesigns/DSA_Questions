package Graph;
import java.util.*;
public class DetectCycle {
    int V;
    List<List<Integer>> list;
    DetectCycle(int V){
        this.V = V;
        list = new ArrayList<>(V);
        
        for(int i = 0; i < V; i++)
        {
            list.add(new LinkedList<Integer>());
        }
    }
    
    void addEdge(int s, int d)
    {
        list.get(s).add(d);
    }
    
    boolean isCyclic(){
        boolean[] vis = new boolean[V];
        boolean[] q = new boolean[V];
        
        for(int i = 0; i < V; i++)
        {
            if(helper(i, vis, q) == true) return true;
        }
        return false;
    }
    
    boolean helper(int idx, boolean[] visited, boolean[] q){
        if(q[idx] == true)
            return true;
        
        if(visited[idx] == true) return false;
        
        visited[idx] = true;
        q[idx] = true;
        List<Integer> child = list.get(idx);
        for(Integer i : child){
            if(helper(i, visited, q) == true)
                return true;
        }
        q[idx] = false;
        return false;
    }
    
    public static void main(String args[]) {
        DetectCycle gph = new DetectCycle(5);
        gph.addEdge(0, 1);
        gph.addEdge(0, 4);
        gph.addEdge(1, 2);
        gph.addEdge(2, 3);
        gph.addEdge(3, 1);
        gph.addEdge(4, 3);
        
        if(gph.isCyclic()) System.out.print("There is a cycle");
        else System.out.print("There is no cycle");
    }
}