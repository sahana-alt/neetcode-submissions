class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {

        //prims pq
        // List<List<int[]>> adj = new ArrayList<>();
      
        // for(int i=0;i<n;i++){
        //     adj.add(new ArrayList<>());
        // }

        // for(int[] flight: flights){
        //     adj.get(flight[0]).add(new int[]{flight[1], flight[2]});
        // }

        // PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->a[0]-b[0]);
    

        // pq.offer(new int[]{0,src,0});

        // int minCost =0;

        // while(!pq.isEmpty()){
        //     int[] cur = pq.poll();

        //     int price = cur[0];
        //     int city= cur[1];
        //     int stopCnt = cur[2];

         


        //     if(city == dst) return price;

        //     if(stopCnt==k+1) continue;

        //     for(int[] neighbor: adj.get(city)){
        //         int nextCity = neighbor[0];
        //         int nextPrice = neighbor[1];

        //         pq.offer(new int[]{price+nextPrice, nextCity, stopCnt+1});
        //     }
        // }



        // return -1;

        //Bellman ford
        //for graphs with negative cycle and shortest path
        //"Find cheapest path WITH ≤ k stops"= thats why not gijsktra

        int inf = 100000000;
        int[] dist = new int[n];
        Arrays.fill(dist,inf);

       
        dist[src]= 0;

        for(int i=0;i<=k;i++){
            int[] temp = dist.clone();

            //u need reference copy

            for(int[] flight:flights){
                int from = flight[0];
                int to = flight[1];
                int wt = flight[2];

                if (dist[from] == inf) continue;

                temp[to] = Math.min(temp[to], dist[from]+ wt);

            }
            dist = temp;

        }

        return (dist[dst]==inf ? -1:dist[dst]);

    }
}
