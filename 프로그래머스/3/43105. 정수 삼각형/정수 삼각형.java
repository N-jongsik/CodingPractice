class Solution {
    public int solution(int[][] triangle) {
        int n = triangle.length;
        
        int [][] lst = new int[n+1][n+1];
        int [][] dp = new int[n+1][n+1];
        
        for(int i = 1; i <=n; i++ ){
            for(int j = 1; j<=i; j++){
                lst[i][j] = triangle[i-1][j-1];
            }
        }
        
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                dp[i][j] = triangle[i-1][j-1] + Math.max(dp[i-1][j],dp[i-1][j-1]);
            }
        }
        
        int max = -1;
        for(int i=1; i<=n; i++){
            if(dp[n][i] > max){
                max = dp[n][i];
            }
        }
        
        return max;
    }
}