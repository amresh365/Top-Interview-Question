class Solution {
   
    public int minOperations(String[] logs) {
        int backCount=0;
        // Deque<Integer> stack = new ArrayDeque<>() This onothor way to create Stack
        Stack<String>s1=new Stack<>();
        for(String log: logs)
        {
       //Here we cheak if our opration not for stay in same folder & Not for to Move 1 Step Back In parent Folder  
         if(!log.equals("./") && !log.equals("../"))
         {
          s1.push(log); 
         } 
      // In this steps we Cheak if our Stack is Not Empty & our Opration is for Move 1 step Back In Parent Folder
         if(!s1.isEmpty()&&log.equals("../"))
         {
            s1.pop();
         }
       } 
     // In these Line Of Code we pop while Stack != Empty & Count 1 Step Back Operations 
        while(!s1.isEmpty())
        {
         s1.pop();
         backCount++;
        }
       return backCount;
    }
}