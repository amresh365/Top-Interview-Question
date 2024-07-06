class Solution {
    public int passThePillow(int n, int time) {
        int pos=1;
        int direction=1;
        while(time>0)
        {
// In This step we Initializing the direction of our Movement  
          if(pos==n)
          {
            direction=-1;
          } else if(pos==1){
            direction=1;
          }
//In this step Move the position forward direction
         if(direction==1)
         {
            pos++;
            time--;
         }
//In this step Move the position Backword direction      
         else{
            pos--;
            time--;
         }
        }
        return pos;
    }
}