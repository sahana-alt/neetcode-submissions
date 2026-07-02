class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> mp = new HashMap<>();

        for(String s: strs){
            char[] charS = s.toCharArray();

            Arrays.sort(charS);

            String st = new String(charS);

            // System.out.println(st);

            if(mp.containsKey(st)){
                List<String> l = mp.get(st);
                l.add(s);

                mp.put(st,l);
            }else{

                List<String> newList = new ArrayList<>();
                newList.add(s);

                mp.put(st,newList);
            }

        }

        List<List<String>> res = new ArrayList<>();

        for(Map.Entry<String, List<String>> set : mp.entrySet()){
            res.add(set.getValue());

        }

        return res;

        // Map<Integer, List<String>> mp = new HashMap<>();

        // for(String s: strs){
        //     int hashCode = getFreq(s);
        //     if(mp.containsKey(hashCode)){
        //         List<String> l = mp.get(hashCode);
        //         l.add(s);
        //         mp.put(hashCode,l);
        //     }else{
        //         List<String> newList = new ArrayList<>();
        //         newList.add(s);   
        //         mp.put(hashCode, newList);
        //     }
        // }

        // List<List<String>> res = new ArrayList<>();

        // for(Map.Entry<Integer,List<String>> entry: mp.entrySet()){ 
        //     //:- declaration
        //     res.add(entry.getValue());
        // }

        // return res;


        
    }

    // public int getFreq(String s){

    //     int[] freq = new int[26];

    //     for(int i=0;i<s.length();i++){
    //         freq[s.charAt(i)-'a']++;
    //     }

    //     return Arrays.hashCode(freq);        //imp:- only hashCode

    // }
}
