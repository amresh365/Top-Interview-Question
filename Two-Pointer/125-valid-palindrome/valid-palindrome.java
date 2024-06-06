class Solution {
    public boolean palidrone(String nstr)
    {
        int i=0;
        int j=nstr.length()-1;
        while(i<=j)
        {
            if(nstr.charAt(i)!=nstr.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public boolean isPalindrome(String s) {
        String str =s.toLowerCase();
        String outputString=str.replaceAll("[^a-zA-Z0-9]", "");
        if(palidrone(outputString)==true)
        {
            return true;
        }
      return false;
    }
}