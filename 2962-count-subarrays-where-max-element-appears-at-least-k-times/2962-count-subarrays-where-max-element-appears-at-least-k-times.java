class Solution {
    public long countSubarrays(int[] nums, int k) {
        int max = 0 ;
        int n = nums.length;

        for( int i : nums) max = Math.max(max,i);

        int l = 0 ; 
        int r = 0 ; 
        int maxCount = 0 ;
        long c = 0 ; 
        while( r < nums.length){
            if(nums[r] == max) maxCount++;

            if(maxCount >= k ) {
             
                while( maxCount >= k ){
                    c+= n - r;
                    if(nums[l++] == max) {
                        maxCount--;
                    }
                }
                
            }
            r++;
        }

        return c;
    }
}