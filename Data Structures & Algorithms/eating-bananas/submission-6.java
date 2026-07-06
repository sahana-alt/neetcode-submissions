class Solution {
    public int minEatingSpeed(int[] piles, int h) {

//bruteforce
//so tuf video start with speed 1 banana per hour to max banana 
//per hour because more than that total will end up being same
// as u calculate and total<=h then i is the speed
//we do (double) as we want to do ceil of a fractional value
//TC - o(n*m) m is max value times

//optimised
// so theres a patteren where we choose speeds , and ignore one set
// greater than max especially
//int l =0;, hi will be maximum, calculate m 
//binary search on 0 to max
// iterate thriugh array of size n
// so if the ans<=h which is target then i can reduce further
// so do h=m-1
// store fin = m as that could be the answer
    //     Arrays.sort(piles);
    //     int maxi = piles[piles.length - 1];
    //     int l =0;
    //     int hi = maxi;
    //     int ans = 0,fin=0;

    //     while(l<=hi){
    //         int m = l+((hi-l)/2);
    //         System.out.println(l+" "+hi+" "+m);
    //         ans = eatingHours(piles,m);
    //         System.out.println(ans);

    //         if(ans<=h){
    //             fin = m;    //imp
    //             hi=m-1;
                
    //         } else{
    //             l=m+1;
    //         }
    //     }
    //     return fin;
    // }

    // public int eatingHours(int[] piles, int hrs){
    //     int total =0;
    //     for(int i=0;i<piles.length;i++){
    //         total+= Math.ceil((double)piles[i]/hrs);
    //     }
    //     return total;
    // }

    // int n = piles.length;
    // int maxi = Integer.MIN_VALUE;

    // for(int i =0;i<n;i++){
    //     maxi = Math.max(piles[i],maxi);

    // }

    // for(int i = 1;i<=maxi;i++){

    //     int totalHrs = eatingBananas(piles, i);
       

    //     if(totalHrs<h){
          
    //         return i;
    //     }

    // }

    // return maxi;
    // }

    // public int eatingBananas(int[] piles,int n){
     
    //     int total = 0;
    //     for(int i=0;i<piles.length;i++){
             
    //         total += Math.ceil(((double)piles[i]/n));
          
    //     }
       
    //     return total;
    // }


    int n = piles.length;
    int maxi = Integer.MIN_VALUE;
    int ans = 0;

    for(int i =0;i<n;i++){
        maxi = Math.max(piles[i],maxi);
    }

    int l = 1, r = maxi;

    while(l<=r){

        int m = l+(r-l)/2;

        int totalHrs = eatingBananas(piles, m);

         if(totalHrs<=h){
            ans = m;      // this speed works
            r = m - 1;  // check for smaller speed

         }
        if(totalHrs>h){
            //we need higher speed in the array of 1 to maxi
           l=m+1;

        }

    }

      return ans;
    }


    public int eatingBananas(int[] piles,int n){
     
        int total = 0;
        for(int i=0;i<piles.length;i++){
       
            total += Math.ceil(((double)piles[i]/n));
   
        }
        System.out.println(total);
       
        return total;
    }


}
