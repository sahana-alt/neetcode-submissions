class Solution {
    public int countComponents(int n, int[][] edges) {
        int cnt = n;

        int[] parent = new int[n];

        for(int i=0;i<n;i++){
            parent[i] = i;      //edge to itself for later check on new2 edge
        }

        for(int[] edge: edges){
            int pu = find(parent, edge[0]);
            int pv = find(parent, edge[1]);

            if(pu!=pv){ //new edge
                parent[pu] = pv;    //union to the structure
                cnt--;
            }
        }

        return cnt;

    }

    public int find(int[] parent, int x){
        if(parent[x]!=x){   //new edge check
            parent[x] = find(parent,parent[x]); //finding the farther most parent
        }

        return parent[x];
    }
}
