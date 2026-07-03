class Solution {
    public int lengthOfLongestSubstring(String s) {

    //   HashSet<Character> set = new HashSet<>();

  
    // int l=0;
    // int len =0,maxLen=0;
    
    // int r=l+1;
    // if(s.length() ==0){
    //     return 0;
    // }
 
    // set.add(s.charAt(l));

    // while(r<s.length()){
       
    //     char c = s.charAt(r);

    //     while(set.contains(c)){         //important
    //         set.remove(s.charAt(l));
    //         l+=1;


    //     }

    //     set.add(c);
    //     len = r-l+1;
    //     maxLen = Math.max(len,maxLen);

    //     r++;



    // }

    // return maxLen;

    int n = s.length();
    int maxLen = 0;

    for(int i =0;i<n;i++){

        Set<Character> st = new HashSet<>();
        for(int j=i;j<n;j++){
            if(st.contains(s.charAt(j))){
               
                break;
            }
            st.add(s.charAt(j));
            maxLen = Math.max(maxLen,j-i+1);

        }
    }

    return maxLen;

     
    }
}
