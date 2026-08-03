class Solution {
    public int countComponents(int n, int[][] edges) {
        boolean[] visited = new boolean[n];
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int cnt = 0 ;

        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }

        for(int i=0;i<edges.length;i++){
            int u = edges[i][0];
            int v = edges[i][1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        for(int i=0;i<n;i++){
            if(!visited[i]){
                dfs(i,visited,adj);
                cnt++;  //new component
            }
        }

    return cnt;

    //     for(int i=0;i<n;i++){
    //         if(!visited[i]){
    //             dfs(i,visited,adj);
    //             cnt++;  //new component
    //         }
    //     }

    // return cnt;

        // int cnt = n;

        // int[] parent = new int[n];

        // for(int i=0;i<n;i++){
        //     parent[i] = i;      //edge to itself for later check on new2 edge
        // }

        // for(int[] edge: edges){
        //     int pu = find(parent, edge[0]);
        //     int pv = find(parent, edge[1]);

        //     if(pu!=pv){ //new edge
        //         parent[pu] = pv;    //union to the structure
        //         cnt--;
        //     }
        // }

        // return cnt;

    }

    // public int find(int[] parent, int x){
    //     if(parent[x]!=x){   //new edge check
    //         parent[x] = find(parent,parent[x]); //finding the farther most parent
    //     }

    //     return parent[x];
    // }
    
    public void dfs(int i, boolean[] visited, ArrayList<ArrayList<Integer>> adj){
        if(visited[i])  return;
        visited[i] = true;
       

       
        for(int neighbour: adj.get(i)){
            if(!visited[neighbour]){
                dfs(neighbour,visited, adj );
                       
            }
            }
           
        

    }

}
