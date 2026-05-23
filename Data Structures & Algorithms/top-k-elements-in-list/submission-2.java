class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>((a,b)->b.getValue()-a.getValue());
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<nums.length;i++){
          
                mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
      

        }

        for(Map.Entry<Integer,Integer> ent:  mp.entrySet()){
            pq.add(ent);
        }
        int[] res = new int[k];

        for(int i=0;i<k;i++){
            int num = pq.remove().getKey();
            res[i] = num;

        }
        return res;
    }
}
