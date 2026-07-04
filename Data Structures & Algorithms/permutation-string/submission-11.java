                class Solution {
    public boolean checkInclusion(String s1, String s2) {
        // int[] s1Count = new int[26];
        // int[] s2Count = new int[26];

        // for(int i=0;i<s1.length();i++){
        //     s1Count[s1.charAt(i)-'a']++;
        //     s2Count[s2.charAt(i)-'a']++;
        // }
        // int match =0; //the first window check

        // for(int i=0;i<26;i++){
        //     if(s1Count[i]==s2Count[i]){
        //         match++;
        //     }
        // }

        // int l=0; 
        // for(int r=s1.length();r<s2.length();r++){
        //     if(match==26){
        //         return true;
        //     }
        //     int index= s2.charAt(r)-'a';
        //     s2Count[index]++;

        //     if(s1Count[index]==s2Count[index]){
        //         match++;
        //     } else if((s1Count[index]+1==s2Count[index])){
        //         match--;
        //     }

        //     index= s2.charAt(l)-'a';
        //     s2Count[index]--;
        //     if(s1Count[index]==s2Count[index]){
        //         match++;
        //     } else if((s1Count[index]-1==s2Count[index])){
        //         match--;
        //     }
        //     l++;
        // }


        // return false;

        int n = s1.length();
        int m = s2.length();

        char[] chars1 = s1.toCharArray();
        Arrays.sort(chars1);
        String s11 = new String(chars1);

        if(m<n){
            return false;
        }

        for(int i = 0;i<=m-n;i++){

            

                
                String sub = s2.substring(i,i+n);

                char[] chars2 = sub.toCharArray();
                Arrays.sort(chars2);
                String s22 = new String(chars2);


                if(s11.equals(s22)){
                    return true;

                }

            


        }

        return false;
    }
}
