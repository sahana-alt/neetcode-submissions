class Solution {
    public int characterReplacement(String s, int k) {

        int l = 0;
        int maxlen=0,maxf=0;

        Map<Character,Integer> mp = new HashMap<>();

        for(int r=0;r<s.length();r++){

            char ch = s.charAt(r);
            mp.put(ch, mp.getOrDefault(ch,0)+1);

           
            maxf = Math.max(maxf,mp.get(ch));
            

            while((r-l+1)-maxf>k){
                // so if the number of non repeating characters are less
                //u are trying to increase them and decrease the repeating characters
                char lch = s.charAt(l);
                mp.put(lch, mp.getOrDefault(lch,0)-1);
                l++;

            }
            maxlen = Math.max(maxlen,r-l+1);

        }
        return maxlen;
    }
}
