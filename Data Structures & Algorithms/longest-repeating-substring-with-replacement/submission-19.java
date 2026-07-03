                                                                                                                                                                                                                                                                                                                                                                                                                            class Solution {
    public int characterReplacement(String s, int k) {

        int n = s.length();
        int maxFreq = 1;
        int maxLen = 1;
        HashMap<Character,Integer> mp = new HashMap<>();

        // for(int i=0;i<n; i++){
        //     HashMap<Character,Integer> mp = new HashMap<>();
            

        //     for(int j =i;j<n;j++){
        //         char ch = s.charAt(j);
        //         mp.put(ch,mp.getOrDefault(ch,0)+1);
        //         maxFreq = Math.max(maxFreq, mp.get(ch));
        //         int len = j-i+1;
        //         int rep = len - maxFreq;

        //         if(rep<=k){
        //             maxLen = Math.max(maxLen, len);
        //         }else{
        //             break;
        //         }

        //     }
        // }

        // return maxLen;

        int l =0;
        int r =0;

        while(r<n){
            char ch = s.charAt(r);

            mp.put(ch,mp.getOrDefault(ch,0)+1);

            maxFreq = Math.max(maxFreq, mp.get(ch));
            int len = r-l+1;
            int rep = len - maxFreq;

            if(rep>k){
                 mp.put(s.charAt(l),mp.getOrDefault(s.charAt(l),0)-1);
                 l++;
            }

            maxLen = Math.max(maxLen, r-l+1);

            r++;


        }

        return maxLen;
        
    }
}
