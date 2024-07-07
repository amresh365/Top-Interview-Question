class Solution {
    public int xorOperation(int n, int start) {
         int i=0;
     int nums[]=new int[n];
     while(i<n)
     {
      nums[i]=start+(2*i);
      i++;
     }
     int result=0;
     for(i=0;i<n;i++)
     {
      result^=nums[i];
     }
     
   return result; 
    }
}