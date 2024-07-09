class Solution {
    public int jump(int[] nums) {
    int jumps = 0;
    int currEnd = 0;
    int currHighestReach = 0;

	for (int i = 0; i < nums.length - 1; i++) {
        //Here we calculating Highest reach from the 
		currHighestReach = Math.max(currHighestReach, i + nums[i]);

		if (i == currEnd) {
			jumps++;
			currEnd = currHighestReach;
		}
	}

	return jumps; 
    }
}