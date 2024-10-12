class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closestSum = Integer.MAX_VALUE; // Start with a very large value  
        for(int i=0;i<nums.length;i++){
            int j=i+1,k=nums.length-1;

            while(j<k)
            {  int currentSum=nums[i] + nums[j] + nums[k]; 
            if (currentSum == target) {  
                    return currentSum;  
                }   
                  // Update closestSum if the currentSum is closer to target  
                if (Math.abs(currentSum - target) < Math.abs(closestSum - target)) {  
                    closestSum = currentSum;  
                } 
                  if (currentSum < target) {  
                    j++; // We need a larger sum  
                } else {  
                    k--; // We need a smaller sum  
                } 
            }
        }


        return closestSum;
    }
}