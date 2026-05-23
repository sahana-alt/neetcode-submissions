class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
Map<Character,Character> m = new HashMap<>();
        m.put('(',')');
        m.put('{','}');
        m.put('[',']');

        for(char c: s.toCharArray()){
            if(m.containsKey(c))
            {
                st.push(c);
            }else{
                if(st.isEmpty() || m.get(st.pop())!= c){
                    return false;
                }
            }
        }

        return st.isEmpty();
    }
}
