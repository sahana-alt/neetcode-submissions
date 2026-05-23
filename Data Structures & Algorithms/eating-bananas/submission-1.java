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
        Arrays.sort(piles);
        int maxi = piles[piles.length - 1];
        int l =0;
        int hi = maxi;
        int ans = 0,fin=0;

        while(l<=hi){
            int m = l+((hi-l)/2);
            System.out.println(l+" "+hi+" "+m);
            ans = eatingHours(piles,m);
            System.out.println(ans);

            if(ans<=h){
                fin = m;    //imp
                hi=m-1;
                
            } else{
                l=m+1;
            }
        }
        return fin;
    }

    public int eatingHours(int[] piles, int hrs){
        int total =0;
        for(int i=0;i<piles.length;i++){
            total+= Math.ceil((double)piles[i]/hrs);
        }
        return total;
    }
}
