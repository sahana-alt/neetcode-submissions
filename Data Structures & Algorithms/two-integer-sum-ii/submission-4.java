class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer,Integer> m = new HashMap<>();
        int n = numbers.length;
        for(int i = 0;i<n;i++){
            int comp = target-numbers[i];
            if(m.containsKey(comp)){
                if(m.get(comp)< i){
                    return new int[]{m.get(comp)+1,i+1};
                }
            }
            m.put(numbers[i],i);
        }
        return new int []{};
    }
}
