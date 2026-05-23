class Solution {
    public int evalRPN(String[] tokens) {
        int n = tokens.length;
        Stack<Integer> st = new Stack<>();
        int sec =0, fir=0;
       for(String ch: tokens){
            switch(ch){
                case "+":
                 sec = st.pop();
                 fir = st.pop();
                st.push(fir+sec);
                break;
                case "-":
                 sec = st.pop();
                fir = st.pop();
                st.push(fir-sec);
                 break;
                case "*":
                sec = st.pop();
                fir = st.pop();
                st.push(fir*sec);
                 break;
                case "/":
                sec = st.pop();
                fir = st.pop();
                st.push(fir/sec);
                 break;
                default:
                st.push(Integer.parseInt(ch));
            }
        }
       return st.peek(); 
    }
}
