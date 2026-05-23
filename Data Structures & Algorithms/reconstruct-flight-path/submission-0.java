class Solution {
    public List<String> findItinerary(List<List<String>> tickets) {

//it is dfs with eulerian path
//dfs because all nodes should be visited

        Map<String, PriorityQueue<String>> adj = new HashMap<>();




        for(int i=0;i<tickets.size();i++){
            List<String> ticket = tickets.get(i);

            String source = ticket.get(0);
            String destination = ticket.get(1);

            adj.putIfAbsent(source, new PriorityQueue<>());
            adj.get(source).add(destination);


        }

        LinkedList<String> result = new LinkedList<>();
       

        dfs("JFK", adj, result);

        return result;
        
    }

    public void dfs(String start, Map<String, PriorityQueue<String>> adj, LinkedList<String> result ){
        PriorityQueue<String> destinations = adj.get(start);

        while(destinations!= null && !destinations.isEmpty() ){
            String next = destinations.poll();
            dfs(next, adj, result);
        }

        result.addFirst(start);         //imp:-
    }
}
