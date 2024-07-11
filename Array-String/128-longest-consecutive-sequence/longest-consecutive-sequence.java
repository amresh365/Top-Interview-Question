class Solution {
        public int longestConsecutive(int[] nums) {
        List<Integer>l1=new ArrayList<>();
        Arrays.sort(nums);
        if(nums.length==0)
        {
            return 0;
        }
        int count=1;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]+1==nums[i+1])// Here if our num consecutive Increse count by one
            {
                count++;
            }else if(nums[i]+1!=nums[i+1]&&count>1&&nums[i]!=nums[i+1]){
            l1.add(count);
            count=1;
            } 
            else{
            continue;
           }

        }
        l1.add(count);
        //Calculating maximum Consecutive Sequence
        int max=Integer.MIN_VALUE;
        for(int i=0;i<l1.size();i++)
        {
        if(l1.get(i)>max){
        max=l1.get(i);
        }
        }
        return max;
}
}