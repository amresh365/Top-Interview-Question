class Solution {  
    public List<Integer> luckyNumbers(int[][] matrix) {  
        List<Integer> lucky = new ArrayList<>();  

        for (int i = 0; i < matrix.length; i++) {  
            int minRow = Integer.MAX_VALUE;  
            int maxCol = Integer.MIN_VALUE;  
            int colIdx = 0;  
            //Here calculating the min value in row
            for (int j = 0; j < matrix[i].length; j++) {  
                if (matrix[i][j] < minRow) {  
                    minRow = matrix[i][j];  
                    colIdx = j;  
                }  
            }  
            //Here calculating the max value in column
            for (int k = 0; k < matrix.length; k++) {  
                if (matrix[k][colIdx] > maxCol) {  
                    maxCol = matrix[k][colIdx];  
                }  
            }  

            if (minRow == maxCol) {  
                lucky.add(minRow);  
            }  
        }  

        return lucky;  
    }  
}  