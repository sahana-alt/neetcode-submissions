class Solution {
    public int[] findRedundantConnection(int[][] edges) {
       

        int[] parent = new int[edges.length+1];
        Stack<int[]> st = new Stack<>();


        for(int i=0;i<=edges.length;i++){
            parent[i] = i;      //edge to itself for later check on new2 edge
        }

        for(int[] edge: edges){
            int pu = find(parent, edge[0]);
            int pv = find(parent, edge[1]);

            if(pu==pv){ //cycle
              
               st.push(new int[]{edge[0],edge[1]});
            }
            parent[pu] = pv;
        }

        return st.pop();

    }

    public int find(int[] parent, int x){
        if(parent[x]!=x){   //new edge check
            parent[x] = find(parent,parent[x]); //finding the farther most parent
        }

        return parent[x];
    }
    
}
