class Solution {
    public boolean checkInclusion(String s1, String s2) {
        Map<Character,Integer> m = new HashMap<>();
        if(s1.length()>s2.length()){
            return false;
        }
        for(int i = 0;i<s1.length();i++){
                m.put(s1.charAt(i), m.getOrDefault(s1.charAt(i),0)+1);
        }
    
        int match = m.size();
        for(int i = 0;i<s2.length();i++){
            Map<Character, Integer> n = new HashMap<>();
            int cur = 0;
            for(int j = i;j<s2.length();j++){
                n.put(s2.charAt(j), n.getOrDefault(s2.charAt(j),0)+1);
                if(m.getOrDefault(s2.charAt(j),0)<n.get(s2.charAt(j))){
                    break;
                }
                if(m.getOrDefault(s2.charAt(j),0) == n.get(s2.charAt(j))){
                    cur++;
                }
                if(cur == match){
                        return true;
                }
            }

        }
        return false;
    }
}
