class Solution {
    public int numSquares(int n) {
       List<Integer> list = new ArrayList<>();
       GetSquares(n,list); 
       int s = list.size();

       int[] dp = new int[n+1];
       Arrays.fill(dp,n+1);
       dp[0] = 0;

       for( int i : list){
         for( int p = i ; p <= n ; p++){
            dp[p] = Math.min(dp[p],dp[p-i]+1);
         }
       }

       return dp[n];
    }

    public void GetSquares( int n , List<Integer> list){
       for( int i = 1 ; i * i <= n ; i++){
         list.add(i*i);
       }
    }

    
}