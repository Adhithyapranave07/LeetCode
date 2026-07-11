class Solution {
    public int maxVowels(String s, int k) {
        int max = 0;
        int c = 0 ; 
        for( int i = 0 ; i < k ; i++){
            c += isVowel(s.charAt(i));
        }
        max = c ;

        for( int i = k ; i < s.length() ; i++){
            if(isVowel(s.charAt(i-k)) == 1 ) c--;
            if(isVowel(s.charAt(i) ) == 1 ) c++;

            max = Math.max(max,c);
        }

        return max;
    }

    public int isVowel(char ch ){
        if( ch == 'a' || ch == 'i' || ch == 'o' || ch == 'e' || ch == 'u' ) return 1 ;

        return 0;
    }
}