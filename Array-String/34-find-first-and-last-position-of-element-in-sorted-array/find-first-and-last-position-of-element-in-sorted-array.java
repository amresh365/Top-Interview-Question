class Solution {
    public int[] searchRange(int[] nums, int target) {
        //Here searching first position using binary search
        int l=0;
        int h=nums.length-1;
        int res[]={-1,-1};
        int mid=0;
        while(l<=h)
        {
             mid=(l+h)/2;
            if(target==nums[mid])
            {
                res[0]=mid;
                h=mid-1;
            }
            else if(target<nums[mid])
            {
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
       //Here searching last position using binary search  
       l=0;
       h=nums.length-1;
       mid=0;
       while(l<=h)
       {
           mid=(l+h)/2;
           if(target==nums[mid]){
               res[1]=mid;
                l=mid+1;
           }
           else if(target<nums[mid])
           {
             h=mid-1;
           }
           else{
               l=mid+1;
           }
       }
    return res;
    }
}