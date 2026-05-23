class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>((a,b)-> b.getValue()-a.getValue());

        Map<Integer,Integer> m= new HashMap<>();

        for(int num:nums){
                m.put(num,m.getOrDefault(num,0)+1);
        }

        for(Map.Entry<Integer,Integer> set : m.entrySet()){
            pq.add(set);
        }
        int[] l = new int[k];
        
        for(int i=0;i<k;i++){
            l[i] = pq.poll().getKey();
        }
        return l;
    }
}
