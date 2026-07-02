class Solution {
    public boolean isPalindrome(String s) {

        // StringBuilder sb = new StringBuilder();

        // char[] chars = s.toCharArray();

        // for(char c: chars){
        //     if(Character.isLetterOrDigit(c)){
        //         sb.append(Character.toLowerCase(c));
        //     }
        // }

        // int l =0;
        // int r = sb.length()-1;

        // String newString = sb.toString();

        // while(l<=r){
        //     if(newString.charAt(l)!=newString.charAt(r)){
        //         return false;
        //     }
        //     l++;
        //     r--;
        // }

        // return true;


        int l = 0, r = s.length()-1;


        while(l<r){
            while(l<r && 
            !Character.isLetterOrDigit(s.charAt(l))){
                l++;
            }

             while(l<r && 
            !Character.isLetterOrDigit(s.charAt(r))){
                r--;
            }

            if(Character.toLowerCase(s.charAt(l))!=Character.toLowerCase(s.charAt(r))){
                // System.out.println(s.substring(l,r+1));
               
                return false;
            }

            l++;
            r--;


        }

        return true;
        
    }
}
