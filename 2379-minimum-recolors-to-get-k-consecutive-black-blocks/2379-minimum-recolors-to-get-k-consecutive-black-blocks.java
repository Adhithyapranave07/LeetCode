class Solution {
    public int minimumRecolors(String blocks, int k) {
        int l = 0 ; 
        int White = 0 ; 
        
       for( int i = 0 ; i < k ; i++) {
          if(blocks.charAt(i) == 'W') White++;
       }

       int min = White ; 

       for( int i = k ; i < blocks.length() ; i++){
           if(blocks.charAt(i) == 'W') White++;
           
           if(blocks.charAt(i-k) == 'W') White--;

           min = Math.min(min,White);
       }

      return min  ;
       
    }
}