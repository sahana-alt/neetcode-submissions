class Solution {
    public boolean checkInclusion(String s1, String s2) {
        Map<Character,Integer> mp1 = new HashMap<>();

        for(int i=0;i<s1.length();i++){
            char ch = s1.charAt(i);
            mp1.put(ch, mp1.getOrDefault(ch,0)+1);
        }
        int need = mp1.size();
        
        for(int i=0;i<s2.length();i++){
            Map<Character,Integer> mp2 = new HashMap<>();
            int cur = 0;
            for(int j =i;j<s2.length();j++){
                char ch = s2.charAt(j);
                mp2.put(ch,mp2.getOrDefault(ch,0)+1);
                if(mp1.getOrDefault(ch,0)< mp2.get(ch)){
                    break;
                }
                if(mp1.getOrDefault(ch,0)== mp2.get(ch)){
                    cur++;
                }
                if(cur == need){
                    return true;
                }
            }
            
            
        }

        return false;
    }
}
