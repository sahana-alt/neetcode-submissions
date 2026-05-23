class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        List<List<int[]>> adj = new ArrayList<>();

         for(int i=0;i<=n;i++){
            adj.add(new ArrayList<>());

         }

        for(int i=0;i<times.length;i++){
            int u= times[i][0];
            int v= times[i][1];
            int t=  times[i][2];
            adj.get(u).add(new int[]{v,t});
        }

        PriorityQueue<int[] > pq = new PriorityQueue<>((a,b)->a[0]-b[0]);
        boolean[] visited = new boolean[n+1];
        int minTime =0;

        pq.offer(new int[]{0,k});

        while(!pq.isEmpty()){
            int[] cur = pq.poll();
            
            int timeNow = cur[0];
            int node = cur[1];

             if (visited[node]) continue;   //imp:-

            visited[node] = true;
            

            minTime = timeNow;

            for(int[] edge: adj.get(node)){
                int v = edge[0];
                int t = edge[1];
                if(!visited[v]){
                    pq.offer(new int[]{timeNow+t, v});
                }
            }


        }
//imp:- wrong as it does visited[0]
        // for(boolean v:visited){
        //     if(!v)  return -1;
        // }
        for (int i = 1; i <= n; i++) {
            if (!visited[i]) return -1;
        }
        return minTime;
    }
}
