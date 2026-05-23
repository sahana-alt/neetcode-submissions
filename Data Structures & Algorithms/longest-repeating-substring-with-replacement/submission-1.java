class Solution {
    public int characterReplacement(String s, int k) {
        int l = 0;
        int n = s.length();
        Map<Character,Integer> m = new HashMap<>();
        int maxf = 0;
        int res = 0;
        for(int r = 0;r<n;r++){
            m.put(s.charAt(r),m.getOrDefault(s.charAt(r),0)+1);
            maxf = Math.max(maxf,m.get(s.charAt(r)));
            while((r-l+1)-maxf>k){
                 m.put(s.charAt(l),m.getOrDefault(s.charAt(l),0)-1);
                 l++;
            }
            res = Math.max(res,r-l+1);
        }
        return res;
    }
}
