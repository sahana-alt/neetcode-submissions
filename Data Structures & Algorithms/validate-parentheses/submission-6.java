class Solution {
    public boolean isValid(String s) {
        int n = s.length();
        Stack<Character> st = new Stack<>();
        
       

       for(int i=0;i<n;i++){
            char ch = s.charAt(i);

            switch(ch){
                case '(': case '{': case '[':
                st.push(ch);
                break;
                case ')':
                if(!st.isEmpty() && st.peek()=='('){
                    st.pop();
                }else{
                    return false;
                }
                break;
                case '}':
                if(!st.isEmpty() && st.peek()=='{'){
                    st.pop();
                }else{
                    return false;
                }
                break;
                case ']':
                if(!st.isEmpty() && st.peek()=='['){
                    st.pop();
                }else{
                    return false;
                }
                break;
            }
           
        }
        return st.isEmpty();
    }
}
