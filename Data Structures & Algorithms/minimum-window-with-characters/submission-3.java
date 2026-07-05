class Solution {
    public String minWindow(String s, String t) {
        // HashMap<Chatacter,Integer> m1 = new HashMap<>();
        // HashMap<Chatacter,Integer> m2 = new HashMap<>();
        // for(int i=0;i<t.length();i++){
        //     m1.put(t.charAt(i),m1.getOrDefault(t.CharAt(i),0)+1);
        // }
        // int l=0;
        // int match =0;
        // int need = m1.size();
        // for(int r = 0;r<s.length();r++){
        //     char ch = s.charAt(r);
        //     m2.put(ch,m2.getOrDefault(ch,0)+1)
        //     if(m1.containsKey(ch) && m2.get(ch).equals(m1.get(ch))){
        //         match++;
        //     }
        //     if(match == need){
        //         int l = r-l+1;
        //         if(l<min){
        //             min = l;
                    
        //         }
        //     }

        // }

        //array or mapo with 2 pointer

        //while because after finding the 
        //valid window, we need to remove unnecessary 
        //characters from left and update length
        // required logic is because we only check unique characters

        char[] char1 = s.toCharArray();
        char[] char2 = t.toCharArray();

        int[] freq1 = new int[128];
        int[] freq2 = new int[128];

        int n = char1.length;
        int m = char2.length;

        int required = 0;
        

        for(int i=0;i<m;i++){
            if(freq2[char2[i]] == 0) required++;
            freq2[char2[i]]++;
        }

        int l = 0, r=0;   
        int matchedCount = 0;
        int start=0;
        int mini = Integer.MAX_VALUE;

        while(r<n){

            freq1[char1[r]]++;

            int idx = char1[r];

            if (freq1[idx] == freq2[idx] && freq2[idx]!=0){
                matchedCount++;
            }

            while(matchedCount == required){
                int len = r-l+1;
                if(len<mini){
                    mini = len;
                    start = l;

                }

                int leftIdx = char1[l];
                freq1[leftIdx]--;
                
                if (freq2[leftIdx]!=0 && freq1[leftIdx] < freq2[leftIdx]) {
                    matchedCount--;
                }

                l++;
            }

            r++;

        }

     

        return mini== Integer.MAX_VALUE? "" : s.substring(start,start+mini);
    }
}
