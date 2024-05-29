class Solution {
    public int majorityElement(int[] nums) {
               int maxval=0;
      int maxkey=0;
     Map<Integer,Integer>m=new HashMap<>();
      
      for (int i = 0; i < nums.length; i++) {
           
            m.put(nums[i], m.getOrDefault(nums[i], 0) + 1);

        }

      for (Map.Entry<Integer, Integer> entry : m.entrySet()) {
            if (entry.getValue() > maxval) {
                maxval=entry.getValue();
               maxkey=entry.getKey();
            }
           
        }
     	return maxkey; 
  
    }
}