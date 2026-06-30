class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        int n = nums.length ;

        int subsets = 1 << n ; 

        for( int num =  0 ; num < subsets  ; num++){
            List<Integer> Sublist = new ArrayList<>();
            for( int i = 0 ; i < n  ; i++ ){
                if( (num & ( 1 << i ) ) != 0 ) {
                    Sublist.add(nums[i]);
                }
            }

            list.add(Sublist);
        }

        return list;
    }
}
