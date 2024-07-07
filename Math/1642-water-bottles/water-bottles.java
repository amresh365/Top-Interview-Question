class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int ans=numBottles;
        int currFullBottle=numBottles;
        int countFullBottle=0;
       
      while(currFullBottle>=numExchange)
      {
        //Here we Count The Full Bottle In Exchange Of Empty Bottles  
        while(currFullBottle>=numExchange)
        {
         currFullBottle-=numExchange;
         countFullBottle++;
        }
       //Here We adding our Exchanged Full Bottle 
       currFullBottle+=countFullBottle;
       
       //Here we Modify Our Total FullWater Bottle
       ans+=countFullBottle;
       countFullBottle=0;
      }  
     return ans;
    }
}