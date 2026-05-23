class Solution {
    public int[] twoSum(int[] numbers, int target) {


        int start = 0;
        int end = numbers.length -1;

        while(start<=end){
          
            int s = numbers[start]+numbers[end];
            if(s == target){
                return new int[]{start+1,end+1};
            }
            if(s<target){
                start+=1;
            } else{
                end-=1;
            }
        }
        return new int[]{};
        
    }
}
