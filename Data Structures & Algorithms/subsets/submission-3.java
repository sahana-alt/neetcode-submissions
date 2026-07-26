class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int n=nums.length;
        //striver l6
        // take n=and not take recurision trtee

        // List<List<Integer>> res = new ArrayList<>();
        // res.add(new ArrayList());

        // for(int num:nums){
        //     int size = res.size();
        //     for(int i=0;i<size;i++){
        //         List<Integer> l = new ArrayList<>(res.get(i));
        //         l.add(num);
        //         res.add(l);
        //     }
        // }
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
       
        subset(nums, 0, res, l);
        return  res;
    }

    private void subset(int[] nums,int index, List<List<Integer>> res, List<Integer> l){
        if(index>=nums.length){
            res.add(new ArrayList<>(l));
            return;
        }
        l.add(nums[index]);
        subset(nums, index+1, res, l);
        l.remove(l.size()-1);
        subset(nums, index+1, res, l);

    }

    // private void subset(int[] nums, int index, List<List<Integer>> res, List<Integer> l){
    //     int n = nums.length;
    //     if(index>=n){

    //         res.add(new ArrayList<>(l)); //imp:- or u will just 
    //         //send the refernce poinetr to l
    //         return;
    //     }


    // //adding- taking
    //     l.add(nums[index]);
    //     subset(nums,index+1, res, l);
    // // removing - not taking
    //     l.remove(l.size()-1);
    //     subset(nums,index+1, res, l);
        

    



// 
    // }
}
