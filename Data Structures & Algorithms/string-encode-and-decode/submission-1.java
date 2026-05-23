class Solution {

    public String encode(List<String> strs) {
        StringBuffer sb = new StringBuffer();

        for(int i=0;i<strs.size();i++){
            int l = strs.get(i).length();
            sb.append(Integer.toString(l));
            sb.append("#");
            sb.append(strs.get(i));
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> lst = new ArrayList<>();
        int i =0;
        while(i<str.length()){
            int j =i;      // imp as length can be 2 digits
            while(str.charAt(j)!='#'){
                j++;
            }           // j is length of the length of string number
            int l = Integer.parseInt(str.substring(i,j));
            String s = str.substring(j+1,j+1+l);      //substring
            lst.add(s);

            i =j+l+1;
        }
        return lst;
    }
}
