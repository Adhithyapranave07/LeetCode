class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int c = 0 ; 
         
      
        int l = 0 ; 
        int r = 0 ; 
        int sum = 1 ;
        while( r < nums.length ){
            sum *= nums[r];
            while(sum >= k){
                sum /= nums[l];
                l++;
            }
           if( sum < k ) c+= r-l+1;
            r++;
        }

        
      

        return c ;
    } 
}