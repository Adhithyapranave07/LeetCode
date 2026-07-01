class Solution {
    public char findTheDifference(String s, String t) {
        int xor = 0 ; 

       for( char ch : s.toCharArray()){
           xor ^= (int) ch ;
       }
       for( char ch : t.toCharArray()){
           xor ^= (int) ch ;
       }

       return (char) xor;
    }
}