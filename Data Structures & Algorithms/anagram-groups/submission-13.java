class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<Integer, List<String>> mp = new HashMap<>();

        for(String s: strs){


            int freq = getFreqCode(s);

            

            // System.out.println(st);

            if(mp.containsKey(freq)){
                List<String> l = mp.get(freq);
                l.add(s);

                mp.put(freq,l);
            }else{

                List<String> newList = new ArrayList<>();
                newList.add(s);

                mp.put(freq,newList);
            }

        }

        List<List<String>> res = new ArrayList<>();

        for(Map.Entry<Integer, List<String>> set : mp.entrySet()){
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

    public int getFreqCode(String s){
        int[] freq = new int[26];
        char[] chars = s.toCharArray();

        for(char ch: chars){
            freq[ch-'a']++;
        }

        return Arrays.hashCode(freq);
    }

    // public int getFreq(String s){

    //     int[] freq = new int[26];

    //     for(int i=0;i<s.length();i++){
    //         freq[s.charAt(i)-'a']++;
    //     }

    //     return Arrays.hashCode(freq);        //imp:- only hashCode

    // }
}
