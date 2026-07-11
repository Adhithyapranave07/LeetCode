class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> heap = new PriorityQueue<>(
            (a,b) -> b-a
        );

        for( int i : stones) heap.offer(i);
        

        // System.out.println(heap);
        while(!heap.isEmpty()) {

           if(heap.size() == 1 ) return heap.poll();
            int f = heap.poll();
            int s = 0 ; 
            if(!heap.isEmpty()) {
                 s =  heap.poll();
            }

            if(s == f) continue ;

            if( s <= f ){
                heap.offer(f-s);
            }


        }
        return 0;
    }
}