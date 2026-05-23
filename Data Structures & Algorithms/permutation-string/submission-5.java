class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        //imp:- s2 contains s1, try length variatipn later
        char[] sub = s1.toCharArray();
        Arrays.sort(sub);
        String s1sorted = new String(sub);


        for(int i=0;i<s2.length();i++){
            for(int j=i;j<s2.length();j++){
                String substr = s2.substring(i,j+1);
                char[] s2sub = substr.toCharArray();
                Arrays.sort(s2sub);
                String s2subsorted = new String(s2sub);

                if(s1sorted.equals(s2subsorted)){
                    return true;
                }

            }
        }
        return false;
    }
}
