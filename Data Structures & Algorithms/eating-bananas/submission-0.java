class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int maxi = piles[piles.length - 1];
       

        for(int i=1;i<maxi;i++){

            int ans = eatingHours(piles,i);

            if(ans<=h){
                return i;
            }
        }
        return maxi;
    }

    public int eatingHours(int[] piles, int hrs){
        int total =0;
        for(int i=0;i<piles.length;i++){
            total+= Math.ceil((double)piles[i]/hrs);
        }
        return total;
    }
}
