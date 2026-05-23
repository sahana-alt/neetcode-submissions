class Solution {
    public int minCostConnectPoints(int[][] points) {
        //no adj as extra n2 space
        //we compute dist on fly

//         int n = points.length;

//         PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->a[0]-b[0]);

//         boolean[] visited = new boolean[n];

//         int minCost = 0;
//         int pointsCnt = 0;

//         pq.offer(new int[]{0,0});

//         while(!pq.isEmpty() && pointsCnt<n){
//             int[] cur = pq.poll();

//             int cost = cur[0];
//             int node = cur[1];

//             if(visited[node])  continue; 

//             //imp to mark visted
//             visited[node] = true;
//             pointsCnt++;
//             minCost+=cost;
            
            
//             //n2logn
//             for(int next =0;next<n;next++){
//                 if(!visited[next]){
//  //imp:-
//                     int wt = Math.abs(points[node][0] - points[next][0])
//                            + Math.abs(points[node][1] - points[next][1]);
                    
//                     pq.offer(new int[]{wt,next});
//                 }

//             }

        
//         }

//         if(pointsCnt!=n)    return -1;

//         return minCost;

        int n = points.length;

        List<int[]> adj = new ArrayList<>();


       
//imp:-
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                int wt = Math.abs(points[i][0]- points[j][0])+
                Math.abs(points[i][1]- points[j][1]);
                adj.add(new int[]{wt,i,j});
            }     
        }

        Collections.sort(adj, (a,b)->(a[0]-b[0]));
        int[] parent = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }

        int minCost = 0;
        int edgesUsed = 0;

        for(int[] edge: adj){
            int wt = edge[0];
            int u = edge[1];
            int v = edge[2];

            int pu = findParent(u, parent);
            int pv = findParent(v, parent);

            if(pu==pv)      continue;

            parent[pu] = pv;
            minCost+=wt;
            edgesUsed++;



        }

        if(edgesUsed!=n-1)    return -1;
        return minCost;
        
    }

    private int findParent(int x, int[] parent){
        if(parent[x]!=x){
            parent[x] = findParent(parent[x], parent);
        }

        return parent[x];
    }
}
