class Solution {
    public int findTheWinner(int n, int k) {
        List<Integer>friends=new ArrayList<>();
        for(int i=1;i<=n;i++)
        {
            friends.add(i);
        }
        int startIndex=0;
        while(friends.size()>1)
        { 
         // In this line of code we calculating next index which will be remove from the list
         int nextIndex=(startIndex+k-1)%friends.size();
         friends.remove(nextIndex);
         startIndex = nextIndex;
         
        }
        
      return friends.get(0); 
    }
}