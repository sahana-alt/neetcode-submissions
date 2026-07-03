class Solution {
    public int[] twoSum(int[] numbers, int target) {

        int n = numbers.length;

        for(int i=0;i<n;i++){

            for(int j=0;j<n;j++){
                
                if(i!=j){
                    int sum = numbers[i]+numbers[j];
                    if(sum == target){
                        return new int[]{Math.min(i+1,j+1),Math.max(i+1,j+1)};
                    }
                }
            }
        }

        return new int[]{};
        
    }
}
