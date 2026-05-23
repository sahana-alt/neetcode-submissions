class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> mp = new HashMap<>();

        int n = s.length();
        int m = t.length();
        if(n!=m){
            return false;
        }

        for(int i =0;i<n;i++){
            char ch = s.charAt(i);
            mp.put(ch,mp.getOrDefault(ch,0)+1);
             System.out.println(ch+" "+mp.get(ch));
        }
        for(int i=0;i<n;i++){
            char ch = t.charAt(i);
            if(mp.containsKey(ch)){
                 System.out.println("f");
                mp.put(ch,mp.get(ch)-1);
               
            }else{
                return false;
            }
            System.out.println("m");
            if(mp.get(ch)==0){
                 System.out.println("l");
                mp.remove(ch);
               
            }
        }
        return mp.size()==0?true:false;
    }
}
