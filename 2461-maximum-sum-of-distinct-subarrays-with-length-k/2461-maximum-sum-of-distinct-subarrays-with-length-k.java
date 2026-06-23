class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long sum = 0; 

        Map<Integer,Integer> map = new HashMap<>();

        for( int i = 0 ; i < k ; i++){
            sum += nums[i];
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        
        long maxSum = 0 ; 

        if(map.size() == k ){
            maxSum = sum ;
        }
       
        int n = nums.length ;

        for( int i = k ; i < n  ; i++ ){
            sum = sum - nums[i-k] + nums[i];
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            if( map.get(nums[i-k]) == 1 ) {
               map.remove(nums[i-k]);
            }
            else {
                map.put(nums[i-k],map.get(nums[i-k]) - 1 );
            }
            
            if( map.size() == k ) maxSum = Math.max(maxSum,sum);
        }

        return maxSum;
    }
}