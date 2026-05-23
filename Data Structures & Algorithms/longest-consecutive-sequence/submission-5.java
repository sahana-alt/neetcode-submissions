class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int start = 1;
        int longest =1;
        int n = nums.length;

        if(n==0){
            return 0;
        }

        if(n==1){
            return start;
        }

        
        

        for(int i=0;i<nums.length-1;i++){
            int diff = nums[i+1]-nums[i];
    
            System.out.println(nums[i]+" "+longest);
            if(diff==1){
                start+=1;
                longest = Math.max(longest,start);
            }else if(diff==0){
                continue;
            }else{
                start = 1;
            }
        }
        return longest;
    }
}
