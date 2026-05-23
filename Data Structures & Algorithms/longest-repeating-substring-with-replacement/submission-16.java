class Solution {
    public int characterReplacement(String s, int k) {
        
        int l =0,r=0,maxLen =0,uniq =0, maxFreq=0;
        int n = s.length();
        HashMap<Character,Integer> mp1 = new HashMap<>();

        // for(int i=0;i<n;i++){
        //     HashMap<Character,Integer> mp = new HashMap<>();
        //     //imp:- reset maxfreq
        //     maxFreq=0;
        //     for(int j =i;j<n;j++){
        //         char ch = s.charAt(j);
        //         mp.put(ch,mp.getOrDefault(ch,0)+1);
        //         maxFreq = Math.max(maxFreq,mp.get(ch));
        //         int len = j-i+1;
        //         int replacing = len - maxFreq;
        //         if(replacing<=k){
        //             maxLen = Math.max(maxLen,len);
        //         }

        //     }
        // }

        while(r<n){
            char ch = s.charAt(r);
            mp1.put(ch,mp1.getOrDefault(ch,0)+1);
            maxFreq = Math.max(maxFreq,mp1.get(ch));
            int len = r-l+1;
            int rep = len - maxFreq;

            while((r-l+1)- maxFreq>k){
                mp1.put(s.charAt(l),mp1.get(s.charAt(l))-1);
              
                l++;
                
            }
            maxLen = Math.max(maxLen,r-l+1);
            r++;


        }

        return maxLen;
    }
}
