class Solution {
    public int evalRPN(String[] tokens) {
    //     int n = tokens.length;
    //     Stack<Integer> st = new Stack<>();
    //     int sec =0, fir=0;
    //    for(String ch: tokens){
    //         switch(ch){
    //             case "+":
    //              sec = st.pop();
    //              fir = st.pop();
    //             st.push(fir+sec);
    //             break;
    //             case "-":
    //              sec = st.pop();
    //             fir = st.pop();
    //             st.push(fir-sec);
    //              break;
    //             case "*":
    //             sec = st.pop();
    //             fir = st.pop();
    //             st.push(fir*sec);
    //              break;
    //             case "/":
    //             sec = st.pop();
    //             fir = st.pop();
    //             st.push(fir/sec);
    //              break;
    //             default:
    //             st.push(Integer.parseInt(ch));
    //         }
    //     }
    //    return st.peek(); 

    int n = tokens.length;
    Stack<Integer> st = new Stack<>();

   

    for(String ch: tokens){
        int first=0,second = 0;
            switch(ch){
                case "+":
                first = st.pop();
                second = st.pop();
                st.push(first+second);
                break;


                case "-":
                first = st.pop();
                second = st.pop();
                st.push(second-first);
                break;

                case "*":
                first = st.pop();
                second = st.pop();
                st.push(first*second);
                break;

                case "/":
                first = st.pop();
                second = st.pop();
                st.push(second/first);
                break;


                default:
                st.push(Integer.parseInt(ch));

            }

          

    }

      return st.peek();
    }
}
