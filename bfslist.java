import java.util.*;
public class BFSLIST {
    public class DFSadjMatrix {
        public static void AdjMatrix {
            public static void dfsAdjmatrix(int[][] graph)
            int start,set<integer>visited){
                if(visited==null){
                    visited add (start);
                    system.out.print(start+"");
                    for(int adjacent=o;adjacent<graph length;adjacent++){
                        if(graph[start](adjacent)=1 visited contains(adjacent)){
                            disAdjMatrix(graph,adjacent,visited);
                        }   
                    }
                }
            }
            public static void main(string [] args){
                int [][]graph={
                    [1,1,1,1]
                    [1,0,0,1]
                    [1,0,0,1]
                    [1,1,1,1]
                system.out.println("/n DFS using adjacency Matrix,");
                dfs AdjMatrix(graph,0,null);
            }
        }
    }
}
