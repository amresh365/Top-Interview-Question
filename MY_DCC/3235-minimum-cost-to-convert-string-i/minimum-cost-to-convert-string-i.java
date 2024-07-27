class Solution {
    public long minimumCost(String source, String target, char[] original, char[] changed, int[] cost) {
		int[][] dist = new int[26][26];
        for(int[] arr : dist) Arrays.fill(arr, Integer.MAX_VALUE);
        for(int i=0; i<original.length; i++) {
            int start = original[i]-'a', end = changed[i]-'a';
        	dist[start][end] = Math.min(cost[i], dist[start][end]);
        }
        for(int i=0; i<26; i++)dist[i][i] = 0;
        for(int k=0; k<26; k++) {
        	for(int i=0; i<26; i++) {
        		for(int j=0; j<26; j++) {
        			if(dist[i][k] == Integer.MAX_VALUE || dist[k][j] == Integer.MAX_VALUE)continue;
        			dist[i][j] = Math.min(dist[i][j], dist[i][k]+dist[k][j]);
        		}
        	}
        }
        
        long totalCost = 0;
        for(int i=0; i<target.length(); i++){
            if(source.charAt(i) == target.charAt(i))continue;
            int start = source.charAt(i)-'a';
            int end = target.charAt(i)-'a';
            if(dist[start][end] == Integer.MAX_VALUE)return -1;
            totalCost += dist[start][end];
        }
		return totalCost;
    }
}