class Solution {
    public int minCostConnectPoints(int[][] points) {
        //no adj as extra n2 space
        //we compute dist on fly

        int n = points.length;

        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->a[0]-b[0]);

        boolean[] visited = new boolean[n];

        int minCost = 0;
        int pointsCnt = 0;

        pq.offer(new int[]{0,0});

        while(!pq.isEmpty() && pointsCnt<n){
            int[] cur = pq.poll();

            int cost = cur[0];
            int node = cur[1];

            if(visited[node])  continue; 

            //imp to mark visted
            visited[node] = true;
            pointsCnt++;
            minCost+=cost;
            
            
            //n2logn
            for(int next =0;next<n;next++){
                if(!visited[next]){
 //imp:-
                    int wt = Math.abs(points[node][0] - points[next][0])
                           + Math.abs(points[node][1] - points[next][1]);
                    
                    pq.offer(new int[]{wt,next});
                }

            }

        
        }

        if(pointsCnt!=n)    return -1;

        return minCost;
        
    }
}
