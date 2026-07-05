// class MinStack {

//     Stack<Integer> st;
//     int mini;
//     public MinStack() {
//         st = new Stack<>();
//         mini = Integer.MAX_VALUE;
        
//     }
    
//     public void push(int val) {

//         st.push(val);

//         if(val<mini){
//             mini = val;
//         }
  
//     }
    
//     public void pop() {

//         Stack<Integer> temp = new Stack<>();

//         int val = st.pop();
        

//         if(val == mini ){
//             mini = Integer.MAX_VALUE;
           
//             while(!st.isEmpty()){
//                 mini = Math.min(st.peek(),mini);
               
//                 temp.push(st.pop());
//             }
//         }
//         while(!temp.isEmpty()){       
//             st.push(temp.pop());
//         }   
//     }
    
//     public int top() {
      
//             return st.peek();
  
//     }
    
//     public int getMin() {
//             System.out.println(mini);
       
//             return mini;
    
//     }
// }

class MinStack {

    Stack<Integer> st;
    Stack<Integer> minSt;

    public MinStack() {
        st= new Stack<>();
        minSt = new Stack<>();

    }

    public void push(int val) {
        st.push(val);

       

        if(minSt.isEmpty() || val<=minSt.peek()){
            minSt.push(val);
        }
    }

    public void pop() {

        int val = st.pop();

    

        if(!minSt.isEmpty() && val == minSt.peek()){

            minSt.pop();

        }

    }

    public int top() {

        return st.peek();

    }

    public int getMin() {


        if(!minSt.isEmpty()){
             return minSt.peek();

        }
        return st.peek();

      
       
    }
}
