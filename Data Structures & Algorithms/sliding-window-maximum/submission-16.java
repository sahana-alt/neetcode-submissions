                                                                        class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        // TC:- O(n) for loop and O(n popback) so o(2n)
        //SC:-                                                                              lst O(n-k) and dq O(k) so sum them
        // monotonic decrerasing stack- use when u need to find
        // max or min in constant window
        //mistakes:-
        //peekfirst addLast(), addFirst() pollFirst(), pollLast()
        //peekFirst(), peekLast()

        // int n = nums.length;
        // int[] lst = new int[n-k+1];
        // int j=0;

        // ArrayDeque<Integer> dq = new ArrayDeque<>();

        // for(int i=0;i<n;i++){
        //     if(!dq.isEmpty() && dq.peekFirst()<=i-k){
        //         dq.pollFirst(); // keeping the size to window
        //     }

        //     while(!dq.isEmpty()&& nums[dq.peekLast()]<= nums[i]){
        //         dq.pollLast(); // removing all unnecessary minimums out
        //     }
        //     dq.addLast(i); 

        //     if(i>=k-1){ // doubt:- what if only 2 elewments then max of 2?
        //         lst[j++] = nums[dq.peekFirst()]; // storing max
        //     }

        // }

        // return lst;


        // int n = nums.length;
        // int[] lst = new int[n-k+1];
        // int idx=0;
        // int maxi = 0;

        // for(int i=0;i<n-k+1;i++){
        //     maxi = nums[i];
           
        //     for(int j=i;j<i+k &&j<n;j++){

        //         if(nums[j]>maxi){
                 
                    
        //             maxi = nums[j];
                  
                    
        //         }

        //     }
           
        //     lst[idx] = maxi;
        //     idx++;
            
        // }

        // return lst;

        //monotonic c=decreasing q - first
        // will amx max and last will have lesser

        // ArrayDeque<Integer> dq = new ArrayDeque<>();
        // int n = nums.length;

        // int[] res = new int[n-k+1];
        // int idx = 0;
        // int maxi = Integer.MIN_VALUE;

        // if(n==0){
        //     return res;
        // }

        // for(int r = 0;r<n;r++){

        //     if(!dq.isEmpty() && dq.peekFirst()<=r-k){
        //         dq.pollLast();
        //     }
        //     //imp:-

        //     while(!dq.isEmpty() && nums[dq.peekFirst()]<=nums[r]){
        //         dq.pollFirst();
        //     }
        //     dq.addLast(r);

            

        //     if (r + 1 >= k){
                
        //         res[idx] = nums[dq.peekFirst()];
        //         idx++;

        //     }
        // }

        // return res;

        int n = nums.length;

        int[] res = new int[n-k+1];
        int idx = 0;

        ArrayDeque<Integer> dq = new ArrayDeque<>();

        for(int i=0;i<n;i++){
            if(!dq.isEmpty() && dq.peekFirst()<=i-k){
                dq.pollFirst(); //remove max from windiow
            }

            while(!dq.isEmpty() && nums[dq.peekLast()]<= nums[i]){
                dq.pollLast();  //remove smaller vales from the back
            }

            dq.addLast(i);

            if(i+1>=k){
                res[idx] = nums[dq.peekFirst()];
                idx++;
            }
        }

        return res;


    }
}
