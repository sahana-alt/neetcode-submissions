class Solution {
    public int trap(int[] height) {
        
        int n = height.length;
        int[] pref = new int[n];
        int[] suf = new int[n];
        pref[0] = height[0]; // imp
        suf[n-1] = height[n-1];
        int total = 0;


        for(int i = 1;i<n;i++){
            pref[i] = Math.max(pref[i-1],height[i]);
            System.out.println(pref[i]);
        }

        for(int i = n-2;i>=0;i--){
            suf[i] = Math.max(suf[i+1],height[i]);
            System.out.println("Suf"+" "+suf[i]+" ");
        }

        for(int i =0;i<n;i++){
            int trapped = Math.abs(Math.min(pref[i],suf[i])-height[i]);

            if (trapped > 0) total += trapped; // imp
        }
        return total;
    }
}
