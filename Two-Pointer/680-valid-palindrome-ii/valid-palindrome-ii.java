class Solution {
    public boolean isPalindrome(String s,int i,int j){
        while(i<=j)
        {
           if(s.charAt(i)!=s.charAt(j))
           {
            return false;
           }
            i++;
            j--;
        }
       return true;
    }
    public boolean validPalindrome(String s) {
       int i=0,j=s.length()-1; 
        while(i<=j){
           // If more then one charecter exist with remaining string return false 
            if(s.charAt(i)!=s.charAt(j)){
                return isPalindrome(s,i+1,j) || isPalindrome(s,i,j-1);
            }
            else{
                i++;
                j--;
            }
        }
        return true;
    }
}













//   for(int i=0;i<s.length();i++)
//        {
//           StringBuilder sb=new StringBuilder(s);
//           sb.deleteCharAt(i);
//           if(isPalindrome(sb)==true)
//           {
//             return true;
//           }
//        } 