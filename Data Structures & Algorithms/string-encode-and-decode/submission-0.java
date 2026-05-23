class Solution {

    public String encode(List<String> strs) {

                StringBuilder sb = new StringBuilder();
        for (String s : strs) {
            // Append the length of the string, a delimiter, and the string itself
            sb.append(s.length()).append('#').append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        int n = str.length();
        int i = 0;
        List<String> res = new ArrayList<>();

        while(i<n){
            int j = str.indexOf('#',i);
            int len = Integer.parseInt(str.substring(i,j));
           


            String s = str.substring(j+1,j+1+len);
            


            res.add(s);
            i = j+len+1;
           
        }
        return res;
    }
}
