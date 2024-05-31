class Solution {
    public int lengthOfLastWord(String s) {
        String str[]=  s.split(" ");
  int l=str.length;

  String r=str[l-1];
  
       return r.length(); 
    }
}