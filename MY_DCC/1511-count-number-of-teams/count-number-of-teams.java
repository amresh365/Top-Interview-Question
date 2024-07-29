class Solution {
    public int numTeams(int[] rating) {
          int n = rating.length;  
        int teamCount = 0;  
        
        // Iterating over each soldier as the middle member of the team.  
        for (int j = 1; j < n - 1; j++) {  
            int leftLess = 0;  
            int leftGreater = 0;  
            int rightLess = 0;  
            int rightGreater = 0;  

            // Count soldiers with rating less and greater than the current one to the left  
            for (int i = 0; i < j; i++) {  
                if (rating[i] < rating[j]) {  
                    leftLess++;  
                } else if (rating[i] > rating[j]) {  
                    leftGreater++;  
                }  
            }  

            //Here Count soldiers with rating less and greater than the current one to the right  
            for (int k = j + 1; k < n; k++) {  
                if (rating[k] < rating[j]) {  
                    rightLess++;  
                } else if (rating[k] > rating[j]) {  
                    rightGreater++;  
                }  
            }  

            //Here Calculate the number of valid teams  
            teamCount += leftLess * rightGreater;    // (i < j < k)  
            teamCount += leftGreater * rightLess;    // (i > j > k)  
        }  

        return teamCount;
    }
}