class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        Set<Integer> s = new HashSet<>();
        int max = Integer.MIN_VALUE;
        if(n==0){
            return 0;
        }
        for(int num:nums){
            s.add(num);
        }
        for(int i = 0;i<n;i++){
            int cur = nums[i];
            if(!s.contains(cur-1)){
                int len = 1;

                while(s.contains(cur+len)){
                    len++;
                }
            max = Math.max(len,max);
            }
           

        }
        return max;
    }
}
