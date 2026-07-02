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

        int n = nums.length;

        Map<Integer, Integer> mp = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }

        // List<Map.Entry<Integer,Integer>> l = new ArrayList<>(mp.entrySet());

        // l.sort((a,b)-> b.getValue()-a.getValue());

        // int[] res = new int[k];

        // for(int i=0;i<k;i++){
        //     res[i] = l.get(i).getKey();
        // }

        // return res;


        //Bucket Sort- buclet hold max length n as that is maxfreq

        // List<Integer>[] bucket = new ArrayList[n+1];

        // for(int num : mp.keySet()){
           
        //     int count = mp.get(num);
        //      System.out.println(bucket[count]+" "+num);

        //     if(bucket[count] == null){
        //         bucket[count] = new ArrayList<>();
        //     }

        //     bucket[count].add(num);

            
        // }


        // int[] res = new int[k];
        // int idx=0;



        // for(int i = bucket.length-1;i>=0 && idx<k;i--){
            
        //     if(bucket[i] != null){
        //         for(int num:bucket[i]){

        //             res[idx++] = num;
                   

        //             if(idx == k){
        //                 break;
        //             }
                    

        //         }
        //     }
        // }

        // return res;

        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a,b)->b.getValue()-a.getValue());


        for(Map.Entry<Integer,Integer> set: mp.entrySet()){
            pq.add(set);
        }

        int[] res = new int[k];

        for(int i=0;i<k;i++){
            res[i] = pq.poll().getKey();
        }

        return res;




    }
}
