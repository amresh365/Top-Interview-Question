class Solution {
    public int maximumGain(String s, int x, int y) {
        StringBuilder sb= new StringBuilder(s);
        int maxX=0,maxY=0,score=0,i=0;
        if(x>y)
        {
          maxX=x;
        }else{
            maxY=y;
        }
    //Here If x is greater than y then we first count x score then y after removing x points   
        if(maxX!=0)
        {
         while(i<sb.length()-1){
          if(sb.substring(i,i+2).equals("ab")&&i!=0)
          {
           sb.delete(i,i+2);
            i-=1;
           score+=maxX;
           continue;
          }if(sb.substring(i,i+2).equals("ab")&&i==0)
          {
           sb.delete(i,i+2);
           score+=maxX;
           continue;
          }   
          i++;
         }
         i=0;
        while(i<sb.length()-1){
          if(sb.substring(i,i+2).equals("ba")&&i!=0)
          {
           sb.delete(i,i+2);
            i-=1;
           score+=y;
           continue;
          }if(sb.substring(i,i+2).equals("ba")&&i==0)
          {
           sb.delete(i,i+2);
           score+=y;
           continue;
          }   
          i++;
         }

        }else{//Here If y is greater than x then we first count y score thn x score after removing y point
         while(i<sb.length()-1){
          if(sb.substring(i,i+2).equals("ba")&&i!=0)
          {
           sb.delete(i,i+2);
            i-=1;
           score+=maxY;
           continue;
          }if(sb.substring(i,i+2).equals("ba")&&i==0)
          {
           sb.delete(i,i+2);
           score+=maxY;
           continue;
          }   
          i++;
         }
         i=0;
        while(i<sb.length()-1){
          if(sb.substring(i,i+2).equals("ab")&&i!=0)
          {
           sb.delete(i,i+2);
            i-=1;
           score+=x;
           continue;
          }if(sb.substring(i,i+2).equals("ab")&&i==0)
          {
           sb.delete(i,i+2);
           score+=x;
           continue;
          }   
          i++;
         }

        }
        return score;
    }
}