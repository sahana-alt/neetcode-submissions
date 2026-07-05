class Solution {
    public String minWindow(String s, String t) {

        //array or mapo with 2 pointer

        //while because after finding the 
        //valid window, we need to remove unnecessary 
        //characters from left and update length
        // required logic is because we only check unique characters

        // char[] char1 = s.toCharArray();
        // char[] char2 = t.toCharArray();

        // int[] freq1 = new int[128];
        // int[] freq2 = new int[128];

        // int n = char1.length;
        // int m = char2.length;

        // int required = 0;
        

        // for(int i=0;i<m;i++){
        //     if(freq2[char2[i]] == 0) required++;
        //     freq2[char2[i]]++;
        // }

        // int l = 0, r=0;   
        // int matchedCount = 0;
        // int start=0;
        // int mini = Integer.MAX_VALUE;

        // while(r<n){

        //     freq1[char1[r]]++;

        //     int idx = char1[r];

        //     if (freq1[idx] == freq2[idx] && freq2[idx]!=0){
        //         matchedCount++;
        //     }

        //     while(matchedCount == required){
        //         int len = r-l+1;
        //         if(len<mini){
        //             mini = len;
        //             start = l;

        //         }

        //         int leftIdx = char1[l];
        //         freq1[leftIdx]--;
                
        //         if (freq2[leftIdx]!=0 && freq1[leftIdx] < freq2[leftIdx]) {
        //             matchedCount--;
        //         }

        //         l++;
        //     }

        //     r++;

        // }

     

        // return mini== Integer.MAX_VALUE? "" : s.substring(start,start+mini);

         HashMap<Character,Integer> mp1 = new HashMap<>();
        HashMap<Character,Integer> mp2 = new HashMap<>();

       

        for(int i=0;i<t.length();i++){
            mp2.put(t.charAt(i),mp2.getOrDefault(t.charAt(i),0)+1);
        }

        int need = mp2.size();
        int match = 0;
        int mini = Integer.MAX_VALUE;

        int l = 0, r=0, start =0;

        int n = s.length();

        while(r<n){
            char ch = s.charAt(r);

            mp1.put(ch,mp1.getOrDefault(ch,0)+1);

            if(mp2.getOrDefault(ch,0) != 0 && mp1.get(ch) == mp2.get(ch) ){
                match++;
            }

            //if you have all necessary characters then remove 
            //unnecessary characters on left till window is valid
            while(match == need){
                int len = r-l+1;

                if(len< mini){
                    mini = len;
                    start = l;
                }

                char leftChar = s.charAt(l);
                mp1.put(leftChar, mp1.get(leftChar) - 1);

                 if(mp2.getOrDefault(s.charAt(l),0) != 0 && mp1.get(s.charAt(l)) < mp2.get(s.charAt(l)) ){
                match--;
            }

            l++;


            }

            r++;
        }

        return mini== Integer.MAX_VALUE? "" : s.substring(start,start+mini);
    }
}
