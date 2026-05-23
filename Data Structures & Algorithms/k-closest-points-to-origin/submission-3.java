class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        HashMap<Integer, List<List<Integer>>> mp = new HashMap<>();

        for(int[] point: points)      
        {
            
            List a = new ArrayList<>();
            a.add(point[0]);
            a.add(point[1]);
            int d = (point[0]*point[0])+(point[1]*point[1]);
            if(!mp.containsKey(d)){
                //imp:- list of list of int
                //condition
               mp.put(d, new ArrayList<>());
                pq.add(d);
            }
            mp.get(d).add(a);
            
           
            

        }



        
      
       int[][] result = new int[k][2];
       int idx =0;

        while(idx< k && !pq.isEmpty()) {
            int shortest = pq.poll();
        
            List<List<Integer>> resList = mp.get(shortest);

         
            for(List<Integer> p: resList){
                result[idx][0] = p.get(0);
                result[idx][1] = p.get(1);
                idx++;

            }
         
            
          
        }

        return result;

       
        

    }
}
