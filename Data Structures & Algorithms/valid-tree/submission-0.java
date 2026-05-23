class Solution {
    public boolean validTree(int n, int[][] edges) {

        if (edges.length != n - 1) return false;

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }

        for(int[] edge: edges){
            int u = edge[0];
            int v = edge[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
            //undirected
        }

        // ArrayDequeue<Integer> q = new Arrayequeue<>();
        boolean[] visited = new boolean[n];


        if (dfs(0, -1, visited, adj)) return false; // cycle found

        for(boolean v: visited){
            if(!v) return false;
        }
        return true;

    }

    private boolean  dfs(int node,int parent, 
    boolean[] visited, ArrayList<ArrayList<Integer>> adj){
        visited[node] = true;

        for(int cur: adj.get(node)){
            if(!visited[cur]){
                if(dfs(cur,node, visited,adj)){
                    return true; // cycle fopund in recursion
                }
            } else if(parent!=cur){
                return true;    //cycle found at cur node
            }

        }
    return false;
    }
}
