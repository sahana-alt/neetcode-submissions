class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int len =1;
        int longest = 0;

        for(int num:nums){
            set.add(num);
        }

        for(int num:nums){

            int cur = num;
            while(set.contains(cur+1)){
                cur+=1;
                len+=1;
            }
            longest = Math.max(len,longest);
            len = 1;
        }
        return longest;
    }
}
