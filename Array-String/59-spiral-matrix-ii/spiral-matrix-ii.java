class Solution {
    public int[][] generateMatrix(int n) {
        int matrix[][]=new int[n][n];
        int rs=0;
        int re=n-1;
        int cs=0;
        int ce=n-1;
        int count=1;
        while(rs<=re&&cs<=ce)
        {
         for(int i=cs;i<=ce;i++)
         {
            matrix[rs][i]=count;
            count++;
         }
         rs++;
         for(int i=rs;i<=re;i++)
         {
            matrix[i][ce]=count;
            count++;
         }
        ce--;
        for(int i=ce;i>=cs;i--)
        {
            matrix[re][i]=count;
            count++;
        }
        re--;
        for(int i=re;i>=rs;i--)
        {
         matrix[i][cs]=count;
         count++;
        }
        cs++;
        }

        return matrix;
    }
}