class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {

        HashMap<String,List<String>> mp = new HashMap<>();

       

         wordList.add(beginWord);

        for(String word:wordList){
            for(int j=0;j<word.length();j++){
                StringBuilder sb = new StringBuilder(word);
                sb.setCharAt(j,'*');

                String pattern = sb.toString(); //important
                mp.putIfAbsent(pattern, new ArrayList<>());
                mp.get(pattern).add(word);

            }

        }

        // for(int i=0; i<wordList.size();i++){
        //     int len = mp.get(i).length();

        //     for(int j=0;j<len;j++){
        //         String s = mp.getKey(i);
        //         StringBuilder sb = new StringBuilder(s);
        //         sb.setCharAt(j,'*');
                
        //         mp.put(s,mp.getValue(i).append(sb));
                
        //     }
        // }

         for(String k: mp.keySet()){
            System.out.println(k+" "+mp.get(k));
         }

         Queue<String> q = new ArrayDeque<>();
         Set<String> visited = new HashSet<>();

        q.offer(beginWord);
        visited.add(beginWord);
        int level = 1;

        while(!q.isEmpty()){
            int size = q.size();

            for (int i = 0; i < size; i++) {
                String word = q.poll();
                if (word.equals(endWord)) return level;
                for(int j=0;j<word.length();j++){

                    String pattern = word.substring(0, j) + "*" + word.substring(j + 1);


                    for(String neighbor: mp.getOrDefault(pattern, new ArrayList<>())){
                    if(!visited.contains(neighbor)){    //imp
                        visited.add(neighbor);
                        q.offer(neighbor);
                    }
                }

                }
                

            }
            level++;
        }

        

        return 0;
        
    }
}
