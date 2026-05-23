class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //imp:- hashCode amd entryset
        HashMap<Integer, List<String>> mp = new HashMap<>();
        List<List<String>> res = new ArrayList<>();
        for(int i =0;i<strs.length;i++){
            int hs = getHashCode(strs[i]);
            if(mp.containsKey(hs)){
                List<String> l = mp.get(hs);
                l.add(strs[i]);
                mp.put(hs,l);
            }
            else{
                List<String> l = new ArrayList<>();
                l.add(strs[i]);
                mp.put(hs,l);
            }
        }

     

        
        for(Map.Entry<Integer,List<String>> entry : mp.entrySet()){
            res.add(entry.getValue());
        }
        return res;
    }

    public int getHashCode(String s){
        int sum = 0;
        int[] freq = new int[26];
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            freq[ch-'a']++;
        }
        return Arrays.hashCode(freq);
    }
}
