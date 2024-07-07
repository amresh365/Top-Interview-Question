class Solution {
    public int differenceOfSum(int[] nums) {
         int sumnum=0;
        int sumdig=0;
     for(int num:nums)
     {
         sumnum+=num;
     }

      for(int num1:nums)
      {
       if(num1<10)
       {
           sumdig+=num1;
       }
       else{

        sumdig+=sum(num1);
       }
      }

    return Math.abs(sumnum-sumdig);
    }
    public int sum(int val)
    {
 int sum =0;
while(val!=0)
{
sum=sum+val%10;
val=val/10;
}

return sum;
    }
}