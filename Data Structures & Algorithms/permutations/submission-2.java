class Solution {
    public List<List<Integer>> permute(int[] nums) {
        boolean [] visted = new boolean[nums.length];
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        permuteRescursion(nums, visted, res, l);

      return res;
        
    }
      public void permuteRescursion(int[] nums, boolean [] visted, 
        List<List<Integer>> res, List<Integer> l){
            //use visited as u should keep track, index doesnt matter here
            if(l.size() == nums.length){
                res.add(new ArrayList<>(l));
                return;
            }

            for(int i=0;i<nums.length;i++){
                if(!visted[i]){
                    visted[i] = true;
                    l.add(nums[i]);
                    permuteRescursion(nums, visted, res,l);
                    l.remove(l.size()-1);
                    visted[i] = false;
                }
            }


        }
        
}
