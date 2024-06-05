class Solution {
public int cheakFreq(String word,char ch)
{
int count =0;
for(int i=0;i<word.length();i++)
{
    if(ch==word.charAt(i))
    {
        count++;
    }
}
return count;
}

public int cheakCommon(String words[],char ch)
{
int currFrq=Integer.MAX_VALUE;
for(int i=0;i<words.length;i++)
{ 
 currFrq=Math.min(currFrq,cheakFreq(words[i],ch));
}
return currFrq;
}

    public List<String> commonChars(String[] words) {
        List<String>ans=new ArrayList<>();
        Map<Character,Integer>map=new HashMap<>();
        for(int i=0;i<words[0].length();i++)
        {
          int com=cheakCommon(words,words[0].charAt(i));
          map.put(words[0].charAt(i),com);
        }

       for(Map.Entry<Character,Integer>e : map.entrySet()){
         for(int k=0;k<e.getValue();k++)
         {
            String s=""+e.getKey();
            ans.add(s);
         }
       }

    return ans;
    }
}