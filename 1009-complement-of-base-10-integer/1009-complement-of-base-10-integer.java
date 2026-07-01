class Solution {
    public int bitwiseComplement(int num) {
        if( num == 0 ) return 1;
          StringBuilder sb = new StringBuilder();
        while( num > 0 ){
            if((num&1) == 1 ) sb.append("0");
            else sb.append("1");

            num = num >> 1 ;
    
        }

        return Integer.parseInt(sb.reverse().toString(),2);

    }
}