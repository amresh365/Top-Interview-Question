class Solution {
    public double averageWaitingTime(int[][] customers) {
        double ans=0;
        int finishTime=0; 
        int watingTime=0;
        List<Integer>times=new ArrayList<>();
        for(int i=0;i<customers.length;i++)
        {
          if(customers[i][0]>finishTime)
           {
            finishTime=customers[i][0]+customers[i][1];
           }else{
              finishTime=finishTime+customers[i][1];
           }
          watingTime=finishTime-customers[i][0];
          times.add(watingTime);
        }
       double sum=0;
       for(double val: times)
       {
       sum+=val;
       }
        ans=sum/times.size();
        return ans;
    }
}