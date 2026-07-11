class Solution {
    public int countGoodSubstrings(String s) {
        if( s.length() < 3 ) return 0 ;
        Map<Character,Integer> map = new HashMap<>();
        int c = 0 , l = 0 ; 

       for( int i = 0 ; i < 3 ; i++){
          map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
       }

       if( map.size() == 3 ) c++;
        
       for( int i = 3 ; i < s.length() ; i++){
           if(map.get(s.charAt(i-3)) == 1 ) {
              map.remove(s.charAt(i-3));
           }
           else map.put(s.charAt(i-3),map.get(s.charAt(i-3)) -1);

           map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);

           if( map.size() == 3 ) c++;
       }


        return c;

    }
}