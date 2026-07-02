class Solution {

    public String encode(List<String> strs) {

        StringBuilder sb = new StringBuilder();

        for(String s: strs){
            int len = s.length();
            sb.append(len);
            sb.append("#");
            sb.append(s);
            
           

        }

        System.out.println(sb);

        return sb.toString();

    }

    public List<String> decode(String str) {

        int i =0;
        int n = str.length();

        List<String> l = new ArrayList<>();
        int j=0;
    

        while(i<n){

            j=i;

            while(str.charAt(j)!='#'){
                j++;
            }

            System.out.println(Integer.parseInt(str.substring(i,j)));

            int len = Integer.parseInt(str.substring(i,j));

            String word = str.substring(j+1, j+1+len );
            l.add(word);

            // System.out.println(len);


            i=j+len+1;
        }

        return l;
    }
}
