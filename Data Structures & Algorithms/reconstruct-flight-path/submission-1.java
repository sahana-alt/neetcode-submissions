class Solution {
    public List<String> findItinerary(List<List<String>> tickets) {

        //brute force
        //confusing

    //     Map<String, List<String>> adj = new HashMap<>();

    //     for (List<String> ticket : tickets) { 
    //         adj.putIfAbsent(ticket.get(0), new ArrayList<>()); 
    //     } 

    //     tickets.sort((a, b) -> a.get(1).compareTo(b.get(1))); 
        
    //     for (List<String> ticket : tickets)
    //     { adj.get(ticket.get(0)).add(ticket.get(1));
    //     }
    //     LinkedList<String> res = new LinkedList<>();
    //     res.add("JFK"); 
    //     if (dfs("JFK", res, adj, tickets.size() + 1)) { 
    //          // total nodes in final path = edges + 1
    //         return res;     //valid iternary
    //          } 
        
    //     return new ArrayList<>();

    //                 //nodes = edges + 1

    // }


    //  public boolean dfs(String start, 
    //  LinkedList<String> result , Map<String, List<String>> adj, int targetLen){

    //     if(result.size() == targetLen){
    //         return true;    //all tickets are used- valid itinerary
    //     }

    //     //no more outgoing paths- deadend
    //     if(!adj.containsKey(start)) return false;

    //     // copy list because we will modify original during iteration
    //     List<String> temp = new ArrayList<>(adj.get(start));

    //     for (int i = 0; i < temp.size(); i++) {

    //         String v = temp.get(i);  // next destination

    //         // remove edge (use the ticket)
    //         adj.get(start).remove(i);   //we need temo because of this

    //         // add to path
    //         result.add(v);

    //         // recurse from next airport
    //         if (dfs(v, result, adj, targetLen)) return true;

    //         // BACKTRACK:

    //         // restore edge (put ticket back)
    //         adj.get(start).add(i, v);

    //         // remove last added airport from path
    //         result.remove(result.size() - 1);
    //     }

    //     // no valid path found from this branch
    //     return false;



       

       
    // }
//it is dfs with eulerian path
//dfs because all nodes should be visited
//we can do iterative one too-similar to bfs

    //     Map<String, PriorityQueue<String>> adj = new HashMap<>();




    //     for(int i=0;i<tickets.size();i++){
    //         List<String> ticket = tickets.get(i);

    //         String source = ticket.get(0);
    //         String destination = ticket.get(1);

    //         adj.putIfAbsent(source, new PriorityQueue<>());
    //         adj.get(source).add(destination);


    //     }

    //     LinkedList<String> result = new LinkedList<>();
       

    //     dfs("JFK", adj, result);

    //     return result;
        
    // }

    // public void dfs(String start, Map<String, PriorityQueue<String>> adj, LinkedList<String> result ){
    //     PriorityQueue<String> destinations = adj.get(start);

    //     while(destinations!= null && !destinations.isEmpty() ){
    //         String next = destinations.poll();
    //         dfs(next, adj, result);
    //     }

    //     result.addFirst(start);         //imp:-
    // }

    Map<String, PriorityQueue<String>> adj = new HashMap<>();

    for(List<String> ticket: tickets){
        String start = ticket.get(0);
        String end = ticket.get(1);

        adj.putIfAbsent(start, new PriorityQueue<>());
        adj.get(start).offer(end);

    }

    List<String> res = new ArrayList<>();

    dfs("JFK",res, adj);
    return res;

    }

    public void dfs(String start, List<String> res, Map<String, PriorityQueue<String>> adj ){
        PriorityQueue<String> destinations = adj.get(start);

        while(destinations!=null && !destinations.isEmpty()){
            String next = destinations.poll();
            dfs(next,res,adj);
        }

        res.addFirst(start);
    }
}

