class Solution {
    public boolean validTree(int n, int[][] edges) {

    if (edges.length != n - 1) return false;

//union find

    int [] parent = new int[n];

    for(int i=0;i<n;i++){
        parent[i] = i; //every node is its leader
    }

    for(int[] edge: edges){

        int pu = find(parent,edge[0]);
        int pv = find(parent,edge[1]);

        if(pu==pv)  return false;   //cycle

        parent[pu] = pv;

    }
    
        return true;
    }

    public int find(int[]parent,int x){
        if(parent[x]!=x){
            parent[x] = find(parent,parent[x]);
        }

        return parent[x];
    }

//bfs
    //     ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

    //     for(int i=0;i<n;i++){
    //         adj.add(new ArrayList<>());
    //     }

    //     for(int[] edge: edges){
    //         int u = edge[0];
    //         int v = edge[1];
    //         adj.get(u).add(v);
    //         adj.get(v).add(u);
    //         //undirected
    //     }

    //     // ArrayDequeue<Integer> q = new Arrayequeue<>();
    // boolean[] visited = new boolean[n];

    // Queue<int[]> q = new ArrayDeque<>();

    // q.offer(new int[]{0,-1});
    // visited[0] = true; //imp

    // while(!q.isEmpty()){
    //     int[] cur = q.poll();
    //     int node = cur[0];
    //     int parent = cur[1];
      
    //         for(int neighbor: adj.get(node)){
    //             if (!visited[neighbor]) {
    //                 visited[neighbor] = true;
    //                 q.offer(new int[]{neighbor, node});
    //             } else if (neighbor != parent) {
    //                 return false; // cycle
    //             }
    //         }
            
       

    // }

    // for(boolean v: visited){
    //         if(!v) return false;
    //     }
    
    // return true;



//dfs approach
    //     if (dfs(0, -1, visited, adj)) return false; // cycle found

    //     for(boolean v: visited){
    //         if(!v) return false;
    //     }
    //     return true;

    // }

    // private boolean  dfs(int node,int parent, 
    // boolean[] visited, ArrayList<ArrayList<Integer>> adj){
    //     visited[node] = true;

    //     for(int cur: adj.get(node)){
    //         if(!visited[cur]){
    //             if(dfs(cur,node, visited,adj)){
    //                 return true; // cycle fopund in recursion
    //             }
    //         } else if(parent!=cur){
    //             return true;    //cycle found at cur node
    //         }

    //     }
    // return false;
    // }

    // }
}
