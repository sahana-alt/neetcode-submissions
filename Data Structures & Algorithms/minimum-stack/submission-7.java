class MinStack {
//update mini when stack is empty
//use long sand not intt
    Stack<Long> st;
    long mini ;
    public MinStack() {
        st = new Stack<>();
        mini=0;
    }
    
    public void push(int val) {
        if(st.isEmpty()){
            st.push(0L);
            mini = val;
        }else{
          
            long diff = (long) val - mini;
            st.push(diff);
            if (val < mini) {
                mini = val;
            }
            }
    }
    
    
    public void pop() {
        if(st.isEmpty()) return;
        long x = st.peek();
        st.pop();
        if(x<0){
            mini = mini -x ;
        }
    }
    
    public int top() {
        if(st.isEmpty()) return -1;
        long diff = st.peek();
        if(diff>=0){
            return (int)(mini+diff);
        }else{
            return (int)mini;
        }
    }
    
    public int getMin() {
        return (int)mini;
    }
}

