class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {

        int total = 0;
        int costcurTank = 0;
        int start = 0;

        //so total stores the total gas used information curtank helps us calculate the start
        // if total stays positive then that means we can start else no route is possible;

        for(int i=0;i<cost.length;i++){
            int difference = gas[i]- cost[i];

            total+=difference;
            costcurTank+=difference;

            if(costcurTank<0){
                start = i+1;
                costcurTank = 0;

            }

        }

        return total>=0?start:-1;
        
    }
}
