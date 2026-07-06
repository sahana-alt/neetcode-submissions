class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        //brute force:- traverse store the diff in an array return
        // monotonic stack-next macx next min, store pairs
        //mistake:- result[i] na assign madu
        //monotonic stack tC;-  0(n) sc: 0(n)
        //TC- 0(n);, SC = o(n) final
    //     int n = temperatures.length;
        
    //     int[]res = new int[n];
    //     for(int i=n-2;i>=0;i--){
    //         int j=i+1;
    //         while(j<n && temperatures[j]<=temperatures[i]){  //bpundary condition for skipping cold days
    //             if(res[j]==0){
    //                 j=n;    //there is no warmer day after this
    //                 break;
    //             }
    //             j+=res[j];  //updating j to next warmer d
    //         }
    //         if(j<n){
    //             res[i] = j-i;
    //         }
    //     }

    //     return res;
    // }

    int n = temperatures.length;
        
    int[]res = new int[n];
    int idx = 0;

    for(int i =0;i<n;i++){

        System.out.println("Outside"+"\n");
     int mini = 0;
        for(int j = i;j<n;j++){
            
            System.out.println(temperatures[j]+" ");
            if(temperatures[j]>temperatures[i]){

                System.out.println(temperatures[j]+" "+temperatures[i]+" "+i+" "+j);

                mini = j-i;
                break;
                        
            }    
        }
        res[idx] = mini;
        idx++;
    }

    return res;
}
}