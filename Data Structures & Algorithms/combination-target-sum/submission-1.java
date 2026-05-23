class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
      
        sumList(nums, target, l, res, 0);

        return res;
        
    }

    public void sumList(int[] nums, int target, List<Integer> l, List<List<Integer>> res,int index){
        if(target==0){
            //you can dp target == 0 and pass target+nums[i] in 1st call
            res.add(new ArrayList<>(l));
            return;

        }

        if(target<0 || index >=nums.length){
            return; //imp:-
        }

      
        
        l.add(nums[index]);
        sumList(nums, target-nums[index], l, res, index);
        
        l.remove(l.size()-1);   //imp;-
        sumList(nums, target, l, res, index+1);
        


    }
}
