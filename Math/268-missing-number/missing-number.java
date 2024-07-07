class Solution {
    public int missingNumber(int[] nums) {
         int ans=0;
        Arrays.sort(nums);
        int j=1;

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=j)
            {
                ans=j;
            }
        j++;
        }
        return ans;
    }
}