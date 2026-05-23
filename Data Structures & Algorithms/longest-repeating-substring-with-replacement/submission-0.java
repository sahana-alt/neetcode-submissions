class Solution {
    public int characterReplacement(String s, int k) {
        
        int n = s.length();
        int res = 0;

       for(int i=0;i<n;i++){
        Map<Character,Integer> m = new HashMap<>();
        int maxf = 0;
        for(int j=i;j<n;j++){
            
            m.put(s.charAt(j),m.getOrDefault(s.charAt(j),0)+1);
            maxf = Math.max(maxf,m.get(s.charAt(j)));
            if((j-i+1)- maxf <=k){
                res = Math.max(res, j-i+1);
            }
        }
       }
       return res;
    }
}
