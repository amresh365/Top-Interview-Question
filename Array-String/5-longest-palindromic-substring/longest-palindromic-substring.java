class Solution {
    public boolean solve(int i,int j,String s){

        if(i>=j)
        {
            return true;
        }
        if(s.charAt(i)==s.charAt(j))
        {
          return solve(i+1,j-1,s);
        }
    return false;
     }

    public String longestPalindrome(String s) {
        int n=s.length();
          int maxlen=Integer.MIN_VALUE;
           int sp=0;
            for(int i=0;i<n;i++)
            {
                for(int j=i;j<n;j++)
                {
                    if(solve(i,j,s)==true)
                    {
                        if(j-i+1>maxlen)
                        {
                            maxlen=j-i+1;
                            sp=i;
                        }
                    }
                }
            }
    
        return s.substring(sp,sp+maxlen);
    }
}