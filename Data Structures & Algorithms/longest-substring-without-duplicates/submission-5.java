class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxl = Integer.MIN_VALUE;
        int i = 0;
        if(s.length() == 0){
            return 0;
        }
        Set<Character> st = new HashSet<>();
        for(int j = 0;j<s.length();j++){
            while(st.contains(s.charAt(j))){
                st.remove(s.charAt(i));
                i++;
            }
            maxl = Math.max(maxl,j-i+1);
            st.add(s.charAt(j)); 
            
        }
        
        return maxl;
    }
}
