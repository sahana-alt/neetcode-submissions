class Solution {
    public boolean isPalindrome(String s) {
        int j = s.length()-1;
        int i =0;

        while(i<=j){

            char s1 = s.charAt(i);
            char s2 = s.charAt(j);

            if(Character.isLetterOrDigit(s1) && Character.isLetterOrDigit(s2)){
                
            if(Character.toLowerCase(s1) == Character.toLowerCase(s2)){
                i++;
                j--;
            }else{
                return false;
            }
               
            }else if(!Character.isLetterOrDigit(s1)){
                i++;
            } else if(!Character.isLetterOrDigit(s2)){
                j--;
            }
        }
        return true;
    }
}
