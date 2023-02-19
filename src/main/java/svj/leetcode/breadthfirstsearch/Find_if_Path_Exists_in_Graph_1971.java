package svj.leetcode.breadthfirstsearch;

import java.util.*;

public class Find_if_Path_Exists_in_Graph_1971 {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if(source== destination)
            return true;
        // get list of adj nodes
        Map<Integer, List<Integer>> neighbors= new HashMap<>();
        List<Integer> adj;
        int src, dsn, procNode = 0;
        for(int[] edge: edges){
            src= edge[0]; dsn= edge[1];
            // bi-directional edges
            adj = neighbors.getOrDefault(src, new LinkedList<>()); adj.add(dsn); neighbors.put(src, adj);
            adj= neighbors.getOrDefault(dsn, new LinkedList<>()); adj.add(src); neighbors.put(dsn, adj);
        }
        Deque<Integer> nearNodes= new LinkedList<>();
        Map<Integer, Boolean> visited= new HashMap();
        nearNodes.add(source);
        visited.put(source, true);
        while(! nearNodes.isEmpty()){
            procNode= nearNodes.remove();
            adj= neighbors.getOrDefault(procNode, new LinkedList<>());
            for(Integer node: adj){
                if(node== destination)
                    return true;
                if(visited.getOrDefault(node, false)== false){
                    visited.put(node, true);
                    nearNodes.add(node);
                }
            }
        }
        return false;
    }
}
