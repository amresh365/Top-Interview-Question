class Solution {
    public int minimumDeletions(String s) {
      int i=0,j=1;
      int minDeletion=0;
      int count=0,ans=0;
      while(i!=s.length())
      {
        if(s.charAt(i)=='b')
        {
            count++;
        }else if(count>0&&s.charAt(i)=='a')
        {
          count--;
          ans++;
        }
        i++;
        j++;
      }
      return ans;
    }
}





















