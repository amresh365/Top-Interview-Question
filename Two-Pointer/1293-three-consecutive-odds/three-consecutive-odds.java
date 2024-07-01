class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int cheakP=0;
        for(int i=0;i<arr.length;i++)
        {
                if(arr[i]%2!=0)
                {
                    cheakP++;
                }
                else{
                    cheakP=0;
                }

                 if(cheakP==3)
                {
                return true;
                }
        }
        return false;
    }
}