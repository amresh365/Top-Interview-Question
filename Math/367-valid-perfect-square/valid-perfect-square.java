class Solution {
    public boolean isPerfectSquare(int num) {
         if(Math.floor(Math.sqrt(num))==Math.sqrt(num)) { 
         return true;
      } 
      return false;
    }
}