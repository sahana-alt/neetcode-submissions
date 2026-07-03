class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        int n = nums.length;
        List<List<Integer>> res = new ArrayList<>();



        Arrays.sort(nums);


        for(int i=0;i<n;i++){

            if(i>0 && nums[i] == nums[i-1]){
                //skip duplicates
                continue;
            }

            int l = i+1;
            int r = n-1;

            

            while(l<r){

                int sum = nums[l]+nums[r]+nums[i];

                if(sum == 0){
                    List<Integer> list = Arrays.asList(nums[l], nums[r], nums[i]);
                    res.add(list);
                    l++;
                    r--;

                    while (l < r && nums[l] == nums[l - 1]) {
                        l++;
                    }

                    // Skip duplicates on the right
                    while (l < r && nums[r] == nums[r + 1]) {
                        r--;
                    }

                } else if(sum<0){
                        l++;
                }else{
                        r--;
                }
                }      
        }

         return res;
        
    }
}
