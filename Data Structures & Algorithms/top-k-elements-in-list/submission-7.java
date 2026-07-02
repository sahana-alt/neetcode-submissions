class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        //entryset imp:-

//         PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>((a,b)->b.getValue()-a.getValue());

//         HashMap<Integer,Integer> mp = new HashMap<>();

//         for(int i=0;i<nums.length;i++){
//             mp.put(nums[i], mp.getOrDefault(nums[i],0)+1);
//         }
// for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
//     pq.add(entry);
// }

//         int [] res = new int[k];

//         for(int i=0;i<k;i++){
//             res[i] = pq.poll().getKey();    //imp:-getKey()
//         }
//         return res;

        Map<Integer, Integer> mp = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }

        List<Map.Entry<Integer,Integer>> l = new ArrayList<>(mp.entrySet());

        l.sort((a,b)-> b.getValue()-a.getValue());

        int[] res = new int[k];

        for(int i=0;i<k;i++){
            res[i] = l.get(i).getKey();
        }

        return res;
    }
}
