class Solution {
    public int[] findRedundantConnection(int[][] edges) {
    
    ArrayList<ArrayList<Integer>> adj = new ArrayList<>();


    for(int i=0;i<=edges.length;i++){
        adj.add(new ArrayList<>());
    }

    for(int[] edge: edges){
        int u = edge[0];
        int v = edge[1];

        boolean[] visited = new boolean[edges.length+1];
        if(dfs(u,v,visited,adj)){   //path already exists
            return edge;
        }
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    return new int[0];

    }

    private boolean  dfs(int src,int target, 
    boolean[] visited, ArrayList<ArrayList<Integer>> adj){
        if(src==target) return true;

        visited[src] = true;


        for(int cur: adj.get(src)){
            if(!visited[cur]){
                if(dfs(cur,target, visited,adj)){   //checking reachability not cycle
                    return true; // cycle fopund in recursion
                }
            } 

        }
    return false;
    } 
       
    

    //     int[] parent = new int[edges.length+1];
    //     Stack<int[]> st = new Stack<>();


    //     for(int i=0;i<=edges.length;i++){ // imp
    //         parent[i] = i;      //edge to itself for later check on new2 edge
    //     }

    //     for(int[] edge: edges){
    //         int pu = find(parent, edge[0]);
    //         int pv = find(parent, edge[1]);

    //         if(pu==pv){ //cycle
              
    //            st.push(new int[]{edge[0],edge[1]});
    //         }
    //         parent[pu] = pv;
    //     }

    //     return st.pop();

    // }

    // public int find(int[] parent, int x){
    //     if(parent[x]!=x){   //new edge check
    //         parent[x] = find(parent,parent[x]); //finding the farther most parent
    //     }

    //     return parent[x];
    // }
    
    
}
