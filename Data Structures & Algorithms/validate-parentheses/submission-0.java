class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        Map<Character,Character> m = new HashMap<>();
        m.put('(',')');
        m.put('{','}');
        m.put('[',']');

        // for(char c: s.toCharArray()){
        //     if(m.containsKey(c))
        //     {
        //         if(!st.isEmpty() && st.peek() == m.get(c)){
        //             st.pop();
        //         }else{
        //             return false;
        //         }
        //     }else{
        //         st.push(c);
        //     }
        // }
for (char c : s.toCharArray()) {
            if (m.containsKey(c)) {
                // Push opening bracket onto the stack
                st.push(c);
            } else {
                // Handle closing bracket
                if (st.isEmpty() || m.get(st.pop()) != c) {
                    return false;
                }
            }
        }
        
        return st.isEmpty();
    }
}
