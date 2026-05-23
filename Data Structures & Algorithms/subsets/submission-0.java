class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int n=nums.length;

        // HashSet<int[]> set = new HashSet<>();

        // for(int i=0;i<n;i++){
        //     for(int j=i;j<n;j++){
        //         int[] arr = Arrays.copyOfRange(nums, i, j+1);
        //         set.add(arr);

        //     }     
        // }

        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList());

        for(int num:nums){
            int size = res.size();
            for(int i=0;i<size;i++){
                List<Integer> l = new ArrayList<>(res.get(i));
                l.add(num);
                res.add(l);
            }
            // List<Integer> l =  Arrays.stream(arr).boxed().toList();
           
        }

        
        
        return  res;
    }
}
