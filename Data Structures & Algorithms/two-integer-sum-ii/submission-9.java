class Solution {
    public int[] twoSum(int[] numbers, int target) {

        int n = numbers.length;

       HashMap<Integer,Integer> mp = new HashMap<>();

       for(int i=0;i<n;i++){
           mp.put(numbers[i],i);
       }


       for(int num:numbers){
            int diff = target - num;

            if(mp.containsKey(diff)){
                int index1 = mp.get(diff)+1;
                int index2 = mp.get(num)+1;

                System.out.println(index1+""+index2);

                if(index1!=index2){
                   
                    return new int[]{Math.min(index1,index2),Math.max(index1,index2)};
                }
            }
       }

       return new int[]{};

        // for(int i=0;i<n;i++){

        //     for(int j=i+1;j<n;j++){
                
        //         if(i!=j){
        //             int sum = numbers[i]+numbers[j];
        //             if(sum == target){
        //                 return new int[]{Math.min(i+1,j+1),Math.max(i+1,j+1)};
        //             }
        //         }
        //     }
        // }

        // return new int[]{};


        
    }
}
