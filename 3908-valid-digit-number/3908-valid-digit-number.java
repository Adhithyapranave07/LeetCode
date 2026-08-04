class Solution {
    public boolean validDigit(int n, int x) {
        int c = 0 ; 
        int temp = n ; 
        while( temp > 9  ){
            if(temp%10 == x) c++;
            temp /= 10 ;
        }

        if(c == 0 ) return false;
        if(temp != x) return true ;

        return false;
    }
}