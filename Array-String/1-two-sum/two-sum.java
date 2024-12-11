class Solution {
    public int[] twoSum(int[] nums, int target) {
      Map<Integer,Integer>map=new HashMap<>();
      int ans[]=new int[2];
       int k=0;                                                     
     for(int i=0;i<nums.length;i++)
     {  
        int num=target-nums[i];
        if(map.containsKey(num))
        {                                                     
            ans[k]=map.get(num);
            k++;
            ans[k]=i;
            break;
        } 
        else{
          map.put(nums[i],i);
        } 
     }                                                               
     return ans;                                              
    }                                                                    
}     