class Solution {
    public int maxArea(int[] height) {
         int sline=0;
      int eline=height.length-1;
      int maxWater=0;
     while(sline<eline)
     {
        int minline = Math.min(height[sline], height[eline]);
        int currentWater = minline * (eline - sline);
        maxWater = Math.max(maxWater, currentWater);
        if (height[sline] < height[eline]) {
            sline++;
        } else {
            eline--;
        }
     }
     return maxWater;
    }
}