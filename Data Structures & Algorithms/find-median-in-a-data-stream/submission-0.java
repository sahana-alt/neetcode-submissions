class MedianFinder {
    PriorityQueue<Long> low;
     PriorityQueue<Long> hi;

    public MedianFinder() {
        this.low = new PriorityQueue<>(Collections.reverseOrder());
        this.hi = new PriorityQueue<>();
        
    }
    
    public void addNum(int num) {
        long x = (long)num;
        int n = low.size();
        int m = hi.size();

        //number <max in low should go to low
        if(low.isEmpty() || x <=low.peek()){
                low.offer(x);

        }else{
            hi.offer(x);
            //high add
        } 
        //no need of while as nax diff will be 1 or 2
        // 2Rebalance if needed so that:
        // low.size() == hi.size()  OR  low.size() == hi.size() + 1
            if(low.size()>hi.size()+1){
            
            hi.offer(low.poll());
           
            } else if(hi.size()>low.size()){
                
                low.offer(hi.poll());
               
            }        
        

    
        
    }
    
    public double findMedian() {
       
        //count logic
        int n = low.size();
        int m = hi.size();



        if (n + m == 0) return 0.0;

        if (n == m) { // even total count
            return (low.peek() + hi.peek()) / 2.0;
        } else {      // odd total count
            return low.peek();
        }
       
    }


        
}
   

