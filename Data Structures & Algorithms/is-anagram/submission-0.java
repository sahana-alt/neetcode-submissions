class Solution {
    public boolean isAnagram(String s, String t) {
       
        Map<Character,Integer> m = new HashMap<>();
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            m.put(ch, m.getOrDefault(ch,0)+1);
        }

        for(int i = 0;i<t.length();i++){
            char ch = t.charAt(i);
            if(m.containsKey(ch)){
                m.put(ch, m.getOrDefault(ch,0)-1);
                if(m.get(ch)==0){
                    m.remove(ch);
                }
            } else{
                return false;
            }
        }

        return m.isEmpty();
    }
}
