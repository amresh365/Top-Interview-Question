class Solution {
    public int appendCharacters(String s, String t) {
        int count=0;
        int sp=0;
        int tp=0;
      while(sp!=s.length()&&tp!=t.length())
      {
         if(s.charAt(sp)==t.charAt(tp))
         {
           sp++;
           tp++; 
           count++;
         }else{
            sp++;
         }
      }
        int res=t.length()-count;
        return res;
    }
}