class Solution {
    public int lastStoneWeightII(int[] stones) {
        int sum = 0 ; 

        for( int i : stones) sum+= i ; 
        int tar = sum/2;
        boolean[] dp = new boolean[tar+1];

        dp[0] = true ;

        for( int i : stones){
            for( int s = tar ; s >= i ; s--){
                dp[s] = dp[s] || dp[s-i];
            }
        }
        
        boolean flag = false ;
        int ans = 0 ; 
        int i = tar ; 
        while(!flag){
            if(dp[i] == true) {
                ans = i ; 
                flag = true ;
            }
            i--;
        }
         
        int diff = sum - ans ; 
        
        
        

        return Math.abs(diff-ans);
    }
}