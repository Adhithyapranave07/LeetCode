class Solution {
    public boolean predictTheWinner(int[] nums) {
        int n = nums.length ; 
        int[][] dp = new int[n][n];
        return dfs(0,n-1,dp , nums) >= 0 ; 
    }

    public int dfs( int left , int right , int[][] dp , int[] nums ){
        if( left > right ) return 0 ; 

        if(dp[left][right] != 0 ) return dp[left][right];

        int leftGain = nums[left] - dfs( left + 1, right , dp , nums);
        int RightGain = nums[right] - dfs( left , right - 1 , dp , nums);
        
        return dp[left][right] = Math.max(leftGain,RightGain);
    }
}