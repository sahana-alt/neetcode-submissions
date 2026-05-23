class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<Integer,List<String>> m = new HashMap<>();

        for(String s:strs){
            int key = getFreq(s);
            List<String> l = new ArrayList<>();
            l.add(s);
            if(m.containsKey(key)){
                m.get(key).add(s);
            }else{
                m.put(key,l);
            }
            
        }

        List<List<String>> res = new ArrayList<>();
        for(Map.Entry<Integer,List<String>> set : m.entrySet()){
            res.add(set.getValue());
        }

    return res;
        
    }
     public int getFreq(String s){
            int[] freq = new int[26];
            for(int i = 0;i<s.length();i++){
                char ch = s.charAt(i);
                freq[ch-'a']++;
            }
            return Arrays.hashCode(freq);
        }
}
