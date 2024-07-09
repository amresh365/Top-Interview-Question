class Solution {
    public double averageWaitingTime(int[][] customers) {
        double ans=0;
        int finishTime=0; 
        int watingTime=0;
        List<Integer>times=new ArrayList<>();
        for(int i=0;i<customers.length;i++)
        {
          //Here we cheak if chef is free Or Not & caculate Finish time for each Customer
          if(customers[i][0]>finishTime)
           {
            finishTime=customers[i][0]+customers[i][1];
           }else{
              finishTime=finishTime+customers[i][1];
           }
          //Here we calculating the wating time for everry Customer 
          watingTime=finishTime-customers[i][0];
          times.add(watingTime);
        }

       //In this line of code we calculating the sum 
       double sum=0;
       for(double val: times)
       {
       sum+=val;
       }
       //Here we calculating the Average
        ans=sum/times.size();
        return ans;
    }
}