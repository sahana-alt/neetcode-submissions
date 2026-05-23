class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        Queue<Integer> q = new ArrayDeque<>();

        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }

        for(int i=0;i<prerequisites.length;i++){

           adj.get(prerequisites[i][1]).add(prerequisites[i][0]);
           System.out.println(prerequisites[i][1]+""+prerequisites[i][0]);
        }

        int[] indegree = new int[numCourses];

         for(int i=0;i<numCourses;i++){
            for(int node: adj.get(i)){
                indegree[node]++;
            }
         }

         for(int i=0;i<numCourses;i++){
            if(indegree[i]==0){
               q.add(i);
            }
         }

        
        ArrayList<Integer> res = new ArrayList<>();
        int index =0;
       

        while(!q.isEmpty()){
            int node = q.poll();
            res.add(node);

            for(int nextNode: adj.get(node)){
                indegree[nextNode]--;
                if(indegree[nextNode]==0){
               q.add(nextNode);
            }

            }
        }

    

    

    return res.size() == numCourses;

    }
}
