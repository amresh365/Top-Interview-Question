class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder ans=new StringBuilder();
        int n=(word1.length()+word2.length());
        int len1=word1.length(),len2=word2.length(),i=0,j=0,k=0;
        while(k<n)
        {
          if(len1!=0&&len2!=0)//If both words in characters exist   
          {
            ans.append(word1.charAt(i));
            i++;
            len1--;
            ans.append(word2.charAt(j));
            j++;
            len2--;
          }else if(len1==0&&len2!=0) //when First word all characters appended and second word remain
          {
             ans.append(word2.charAt(j));
             j++;
             len2--;
          }else if(len1!=0&&len2==0){ //when second word all characters appended and first word remain
            ans.append(word1.charAt(i));
            i++;
            len1--;
          }
          k++;
        }
        return ans.toString();
    }
}