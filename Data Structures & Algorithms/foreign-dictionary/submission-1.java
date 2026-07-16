class Solution {
    public String foreignDictionary(String[] words) {

        HashMap<Character, Set<Character>> adj = new HashMap<>();
        HashMap<Character, Integer> indegree = new HashMap<>();
        int n = words.length;

          for (String word : words) {
            for (char c : word.toCharArray()) {
                adj.putIfAbsent(c, new HashSet<>());
                indegree.putIfAbsent(c, 0);
            }
        }

        for(int i=0;i<n-1;i++){
            String w1= words[i];
            String w2 = words[i+1];

            int minLen = Math.min(w1.length(),w2.length());

            if(w1.length()>w2.length() && 
            w1.substring(0,minLen).equals(w2.substring(0,minLen))){
                return "";
            }

            for(int j=0;j<minLen;j++){
                char c1 = w1.charAt(j);
                char c2 = w2.charAt(j);

                if(c1==c2){continue;}
                if(c1!=c2){

                     if (!adj.get(c1).contains(c2)) {
                        adj.get(c1).add(c2);
                        indegree.put(c2, indegree.get(c2) + 1);
                    }
                    break;

                }
            }
        }

            Queue<Character> q = new ArrayDeque<>();
            int indegreeSize = indegree.size();
           
            for(Map.Entry<Character, Set<Character>> set : adj.entrySet()){
                char ch = set.getKey();
                if(indegree.get(ch) == 0){
                    q.offer(ch);
                }
            }

            List<Character> res = new ArrayList<>();

            while(!q.isEmpty()){
                char ch = q.poll();
                res.add(ch);

                for(char nei: adj.get(ch)){
                    indegree.put(nei, indegree.get(nei)-1);
                    if(indegree.get(nei) == 0){
                        q.offer(nei);

                    }
                }
            }
            


        if(res.size() != indegree.size())   return "";


        StringBuilder sb = new StringBuilder();
        for (char ch : res) {
            sb.append(ch);
        }

        return sb.toString();
      
    }
}
