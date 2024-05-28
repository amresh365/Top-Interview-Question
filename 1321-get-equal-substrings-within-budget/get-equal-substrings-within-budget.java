class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
           int n = s.length();
        int[] costs = new int[n];
        
        for (int i = 0; i < n; i++) {
            costs[i] = Math.abs(s.charAt(i) - t.charAt(i));
        }

        int maxLen = 0;
        int currLen = 0;
        int currCost = 0;
        int start = 0;

        for (int end = 0; end < n; end++) {
            currCost += costs[end];

            while (currCost > maxCost) {
                currCost -= costs[start];
                start++;
            }

            currLen = end - start + 1;
            maxLen = Math.max(maxLen, currLen);
        }

        return maxLen;
    }
}