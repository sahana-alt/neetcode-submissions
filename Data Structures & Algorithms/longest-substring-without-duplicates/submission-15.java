class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l =0;
        int maxlen = Integer.MIN_VALUE;
        Set<Character> st = new HashSet<>();
        if(s.length()==0){
            return 0;
        }
        for(int r=0;r<s.length();r++){
            char rch = s.charAt(r);
            while(st.contains(rch)){
                st.remove(s.charAt(l));
                l++;
               
            }
            st.add(rch);
            maxlen = Math.max(maxlen,r-l+1);
        }
        
        return maxlen;
    }
}
