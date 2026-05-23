class Solution {
    public int characterReplacement(String s, int k) {
        
        int maxLen = 0;

        for(int i=0;i<s.length();i++){
            Map<Character,Integer> mp = new HashMap<>();
            int maxFreq = 0;
            for(int j=i;j<s.length();j++){
                 
                 char ch = s.charAt(j);
                 mp.put(ch, mp.getOrDefault(ch, 0) + 1);
                 maxFreq = Math.max(maxFreq,mp.get(ch));

                 int windowlen = j-i+1;
                 int repeating =  windowlen - maxFreq;
                 if(repeating<=k){
                    maxLen = Math.max(windowlen, maxLen);
                 }
            }
        }
        return maxLen;

    }
}
