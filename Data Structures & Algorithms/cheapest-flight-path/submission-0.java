class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {

        //prims pq
        List<List<int[]>> adj = new ArrayList<>();
      
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }

        for(int[] flight: flights){
            adj.get(flight[0]).add(new int[]{flight[1], flight[2]});
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->a[0]-b[0]);
       
        int stopsUsed = 0;

        pq.offer(new int[]{0,src,0});

        int minCost =0;

        while(!pq.isEmpty()){
            int[] cur = pq.poll();

            int price = cur[0];
            int city= cur[1];
            int stopCnt = cur[2];

         


            if(city == dst) return price;

            if(stopCnt==k+1) continue;

            for(int[] neighbor: adj.get(city)){
                int nextCity = neighbor[0];
                int nextPrice = neighbor[1];

                pq.offer(new int[]{price+nextPrice, nextCity, stopCnt+1});
            }
        }



        return -1;

    }
}
