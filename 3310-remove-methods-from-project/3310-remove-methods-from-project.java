class Solution {
    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {
        List<List<Integer>> graph = new ArrayList<>();
        for( int i = 0 ; i < n ; i++){
            graph.add(new ArrayList<>());
        }
        for( int[] a : invocations){
            graph.get(a[0]).add(a[1]);
        }  
        boolean[] visited = new boolean[n];
        List<Integer> list = new ArrayList<>();
 
        dfs(k,visited,graph);

        // System.out.println(set);
        boolean cr = true ;
        for( int i = 0 ; i < n ; i++){
           if(!visited[i]) list.add(i);
            for( int nei : graph.get(i)){
                if(!visited[i] && visited[nei]){
                    cr = false ;
                    break;
                }
            }

            if(!cr) break;
        }
        
        if( !cr) {
            List<Integer> list1 = new ArrayList<>();
            for( int i = 0 ; i < n ; i++) list1.add(i);
            return list1 ;
        }
        return list ;
        
    }

    public void dfs( int i , boolean[] visited ,  List<List<Integer>> graph ){
        visited[i] = true ;
        for( int node : graph.get(i)){
            if(!visited[node]){
                visited[node] =  true ;
                dfs(node,visited,graph);
            }
        }    
    }
}