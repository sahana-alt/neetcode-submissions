class Solution {
    public boolean isPalindrome(String s) {

        StringBuilder sb = new StringBuilder();

        char[] chars = s.toCharArray();

        for(char c: chars){
            if(Character.isLetterOrDigit(c)){
                sb.append(Character.toLowerCase(c));
            }
        }

        int l =0;
        int r = sb.length()-1;

        String newString = sb.toString();

        while(l<=r){
            if(newString.charAt(l)!=newString.charAt(r)){
                return false;
            }
            l++;
            r--;
        }

        return true;
        
    }
}
