
class Solution {
    public int jump(int[] nums) {

        int maxJumps=Integer.MIN_VALUE;
        int cnt = 0;
        int n = nums.length;
        int curEnd=0;

        for(int i=0;i<nums.length-1;i++){
            // if(maxJumps>n-1)  break;   //cannot jimp till end

            maxJumps = Math.max(maxJumps, i+nums[i]);

            if(i==curEnd){
                curEnd = maxJumps;
                cnt++;
            }

            // maxJumps = Math.max(maxJumps, i+nums[i]);
        }

        return cnt;
        
    }
}
