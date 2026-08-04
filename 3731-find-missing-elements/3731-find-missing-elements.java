class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        int min = nums[0]; 
        int max = nums[1];

        for( int i : nums ){
            min = Math.min(i,min);
            max = Math.max(i,max);
            set.add(i);
        }
        
        for( int i = min ; i <= max ; i++){
            if(!set.contains(i)){
                list.add(i);
            }
        }

        return list ;
        


    }
}