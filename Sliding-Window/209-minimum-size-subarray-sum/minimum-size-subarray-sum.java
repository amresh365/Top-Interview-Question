class Solution {
    public int minSubArrayLen(int target, int[] nums) {
         int n=nums.length,left=0,window=0,ans=n+1;
        for(int right=0;right<nums.length;right++)
        {
            window=window+nums[right];
            while(window>=target)
            {
                ans=Math.min(ans,right-left+1);
                window=window-nums[left++];
            }
        }
        return ans==n+1?0:ans;
    }
}