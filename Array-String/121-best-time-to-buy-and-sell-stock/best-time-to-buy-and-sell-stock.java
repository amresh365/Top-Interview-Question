class Solution {
    public int maxProfit(int[] prices) {
          int maxProfit=Integer.MIN_VALUE;
         int minVal=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++)
        {
           if(prices[i]<minVal)
            {
              minVal=prices[i];
            }
              if(prices[i]-minVal>maxProfit)
             {
                maxProfit=prices[i]-minVal;
             }
        }
        return maxProfit;
    }
}