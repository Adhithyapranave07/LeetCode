class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        List<List<Integer>> adj = new ArrayList<>();
        int[] indegree = new int[n];

        for( int i = 0 ; i < n ; i++){
            adj.add(new ArrayList<>());
        }

        for( List<Integer> s : edges){
            adj.get(s.get(0)).add(s.get(1));
            indegree[s.get(1)]++;
        } 
        List<Integer> list = new ArrayList<>();

        for( int i = 0 ; i < n ; i++){
            if(indegree[i] == 0 ) list.add(i);
        }
        return list;
    }
}