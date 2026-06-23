class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        if (p.length() > s.length()) return list;

        Map<Character,Integer> map1 = new LinkedHashMap<>();
        Map<Character,Integer> map2 = new LinkedHashMap<>();
        int n = s.length();
        for( char ch : p.toCharArray()){
            map1.put(ch,map1.getOrDefault(ch,0) + 1 );
        }
        
        int k = p.length();
       
        for(  int i = 0 ; i < k ; i++){
            map2.put(s.charAt(i),map2.getOrDefault(s.charAt(i),0) + 1);
        }

        if(map1.equals(map2)){
            list.add(0);    
        }

        for( int i = k ; i < n  ; i++ ){
            map2.put(s.charAt(i),map2.getOrDefault(s.charAt(i),0)+1);

            if( map2.get(s.charAt(i-k)) == 1  ) {
                map2.remove(s.charAt(i-k));
            }
            else map2.put(s.charAt(i-k),map2.get(s.charAt(i-k))-1);

            if(map1.equals(map2)) list.add((i-k)+1);
        }

        return list;
    }
}