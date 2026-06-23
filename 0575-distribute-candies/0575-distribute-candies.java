class Solution {
    public int distributeCandies(int[] candyType) {
        int n = candyType.length ; 
        n = n / 2 ; 

        Set<Integer> set = new HashSet<>();
        for( int i : candyType) {
            set.add(i);
        }

        if( n > set.size()) return set.size();

        return n ;
    }
}