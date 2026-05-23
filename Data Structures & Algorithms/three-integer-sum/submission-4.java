class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
       
        List<List<Integer>> l = new ArrayList<>();

        Arrays.sort(nums);
       
        for(int i =0;i<n-2;i++){

            for(int j=i+1;j<n-1;j++){
                 int s = (nums[i]+nums[j])*-1;
                for(int k = j+1;k<n;k++) {
                   if(nums[k] == s){
                        List<Integer> triplet = Arrays.asList(nums[i], nums[j], nums[k]);
                        if (!l.contains(triplet)) { // avoid duplicates
                            l.add(triplet);
                        }
                   }


                }
                }
            }
            return l;
        }
}

