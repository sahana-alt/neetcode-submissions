class Solution {
    public String longestPalindrome(String s) {
        int start = 0;
        int len = 1;
        int end =0;

        for(int i=0;i<s.length();i++){
            int oddlength = palindrome(i,i+1,s);
            int evenLength = palindrome(i,i,s);

            len = Math.max(oddlength,evenLength);

            if(len> end-start+1){
                start = i-(len-1)/2;
                end = i+(len/2);
            }
        }

        return new String(s.substring(start,end+1));
        
    }

    public int palindrome(int st,int e, String s){
        int cnt = 1;
        while(st>=0 && e<s.length()&& s.charAt(st)== s.charAt(e)){

            // if(s.charAt(l)== s.charAt(e)){
                cnt++;

            // }

            st--;
            e++;

        }

          return e - st - 1;
    }
}
