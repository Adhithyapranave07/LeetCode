class Solution {
    public int digitFrequencyScore(int n) {
        Map<Integer,Integer> map = new HashMap<>();
        int temp = n ;
        while( temp > 0 ){
            map.put(temp %10,map.getOrDefault(temp %10,0)+1);
            temp /= 10 ;
        }
        
        int total = 0 ; 

        for(Map.Entry<Integer,Integer> e : map.entrySet()){
            total += e.getKey() * e.getValue();
        }

        return total ;

    }
}