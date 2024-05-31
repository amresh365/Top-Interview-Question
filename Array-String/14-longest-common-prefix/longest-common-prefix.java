class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder result=new StringBuilder();
     Arrays.sort(strs);

    char firstWord[]=strs[0].toCharArray();
    char lastWord[]=strs[strs.length-1].toCharArray();

        for(int i=0;i<firstWord.length;i++)
        {
          if(firstWord[i]!=lastWord[i])
          {
            break;
          }
          result.append(firstWord[i]);
         
        }
        return result.toString(); 
    }
}