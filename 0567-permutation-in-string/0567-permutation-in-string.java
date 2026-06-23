class Solution {
    public boolean checkInclusion(String s1, String s2) {
          
        if (s1.length() > s2.length()) return false;

        int[] arr1 = new int[26];
        int[] arr2 = new int[26];

        for( char ch : s1.toCharArray()){
            arr1[ch-'a']++;
        }
        
        int k = s1.length() ;
        int n = s2.length() ;
        for( int i = 0 ; i < k ; i++){
            arr2[s2.charAt(i) - 'a']++;
        }

        if(Arrays.equals(arr1,arr2)) return true ;

        for( int i = k ; i < n ; i++ ){
           arr2[s2.charAt(i) - 'a']++;
           arr2[s2.charAt(i-k) - 'a']--;
           if(Arrays.equals(arr1,arr2)) return true ;
        }

        return false;
    }
}