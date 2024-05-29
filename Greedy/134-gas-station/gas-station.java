class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
         int start=0;
        int totalcost=0;
        int totalfuel=0;
       int current_gas=0;
       for(int i=0;i<gas.length;i++)
       {
        totalfuel=totalfuel+gas[i];
       }
       for(int i=0;i<cost.length;i++)
       {
        totalcost=totalcost+cost[i];
       }
       if(totalfuel<totalcost)
       {
        return -1;
       }
       for(int i=0;i<gas.length;i++)
       {
        current_gas+=(gas[i]-cost[i]);
        if(current_gas<0)
        {
            start=i+1;
            current_gas=0;
        }
       }
       return start;
    }
}