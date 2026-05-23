// class MinStack {
// Stack<Integer> st;
// Stack<Integer> minst;
//     public MinStack() {
//         st = new Stack<>();
//         minst = new Stack();
//     }
    
//     public void push(int val) {
//         st.push(val);
//         int mini = st.peek();
//         if(!minst.isEmpty()){
//            mini = Math.min(val,minst.peek());
//         }
//       minst.push(mini);
//     }
    
//     public void pop() {
//         if(st.isEmpty()){
//             return;
//         }
//         int i= st.peek();
//         st.pop();
//         if(i==minst.peek() &&!minst.isEmpty()){
//             minst.pop();
//         }


//     }
    
//     public int top() {
//         return st.peek();
//     }
    
//     public int getMin() {
//         return minst.peek();
//     }
// }
public class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);
        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }
    
    public void pop() {
        if (stack.isEmpty()) return;
        int top = stack.pop();
        if (top == minStack.peek()) {
            minStack.pop();
        }
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}