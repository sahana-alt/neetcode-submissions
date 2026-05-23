class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {

        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        subSetsRecursion(nums, 0, res, l);
        return res;
    }

    public void subSetsRecursion(int[] nums, int index, List<List<Integer>> res,
     List<Integer> l ){
        if(index>=nums.length){
            res.add(new ArrayList<>(l));
            return;
        }

        l.add(nums[index]);
        subSetsRecursion(nums, index+1, res, l);
        l.remove(l.size()-1);

        int nextindex = index+1;

        while(nextindex<nums.length && nums[nextindex]== nums[index]){
            nextindex++;
        }
        subSetsRecursion(nums, nextindex, res, l);
     }
}
