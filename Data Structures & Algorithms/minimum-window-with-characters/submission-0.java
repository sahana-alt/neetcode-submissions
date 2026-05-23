class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character,Integer> m1 = new HashMap<>();

        for(int i=0;i<t.length();i++){
            m1.put(t.charAt(i),m1.getOrDefault(t.charAt(i),0)+1);
        }

        int match = 0;
        int minLen =Integer.MAX_VALUE;
        String st = "";
        for(int i=0;i<s.length();i++){
            match = 0;
            HashMap<Character,Integer> m2 = new HashMap<>();
            for(int j=i;j<s.length();j++){
                m2.put(s.charAt(j),m2.getOrDefault(s.charAt(j),0)+1);

                if(m1.containsKey(s.charAt(j))){
                    int freq1 = m1.get(s.charAt(j));
                    int freq2 = m2.get(s.charAt(j));
                    if(freq1==freq2){
                        match++;
                    }
                    if(match==m1.size()){
                        minLen = Math.min(j-i+1,minLen);
                        st = s.substring(i,i+minLen);
                    }
                }
            }
        }
       return st; 
    }
}
