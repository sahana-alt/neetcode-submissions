class Solution {
    public int characterReplacement(String s, int k) {
        
        int l =0,r=0,maxLen =0,uniq =0, maxFreq=0;
        int n = s.length();

        for(int i=0;i<n;i++){
            HashMap<Character,Integer> mp = new HashMap<>();
            //imp:- reset maxfreq
            maxFreq=0;
            for(int j =i;j<n;j++){
                char ch = s.charAt(j);
                mp.put(ch,mp.getOrDefault(ch,0)+1);
                maxFreq = Math.max(maxFreq,mp.get(ch));
                int len = j-i+1;
                int replacing = len - maxFreq;
                if(replacing<=k){
                    maxLen = Math.max(maxLen,len);
                }

            }
        }

        return maxLen;
    }
}
