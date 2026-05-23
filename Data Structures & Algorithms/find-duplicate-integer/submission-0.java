class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> st = new HashSet<>();

        for(int i=0;i<nums.length;i++){
            int num = nums[i];

            if(st.contains(nums[i])){
                return nums[i];
            }
            st.add(nums[i]);

      
        }
          return -1;
    }
}
