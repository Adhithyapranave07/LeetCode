class Solution {
    public int minBitFlips(int start, int goal) {
        int diff = start ^ goal ;
        int c = 0 ; 
        while( diff > 0 ){
            c += ( diff & 1);
            diff >>= 1 ;
        }

        return c;
    }
}