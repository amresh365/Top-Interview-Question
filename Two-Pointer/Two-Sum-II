class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int ans[]=new int[2];
        int start=0;
        while(start<numbers.length)
        {   
           int secval=target-numbers[start];//75
           int secnum=numbers[start];//25
           int end=start+1;
            while(end<numbers.length){
               if(target-numbers[end]==secnum)
               {
                ans[0]=start+1;
                ans[1]=end+1; 
                break;
               }
               end++;
            }
            start++;
            if(ans[1]!=0)
            {
                break;
            }
        }
        return ans;  
    }
}
