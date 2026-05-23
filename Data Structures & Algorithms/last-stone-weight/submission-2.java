class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)-> b-a);

        for(int i=0;i<stones.length;i++){
            pq.offer(stones[i]);
        }

     
        while(pq.size()>1){
            int x = pq.poll();
            int y = pq.poll();
            System.out.println(x+" "+y);
            if(x==y){
                continue;
            }
            else if(x<y || y<x){
              
                pq.offer(Math.abs(y-x));

            }
        }

        return pq.isEmpty()? 0 : pq.poll();
        
    }
}
