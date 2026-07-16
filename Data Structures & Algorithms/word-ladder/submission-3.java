class Solution {

     class Pair{
            String word;
            int moves;

            public Pair(String word, int moves){
                this.word = word;
                this.moves = moves;
            }
        }
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {

        // HashMap<String,List<String>> mp = new HashMap<>();

       

        //  wordList.add(beginWord);

        // for(String word:wordList){
        //     for(int j=0;j<word.length();j++){
        //         StringBuilder sb = new StringBuilder(word);
        //         sb.setCharAt(j,'*');

        //         String pattern = sb.toString(); //important
        //         mp.putIfAbsent(pattern, new ArrayList<>());
        //         mp.get(pattern).add(word);

        //     }

        // }

        // // for(int i=0; i<wordList.size();i++){
        // //     int len = mp.get(i).length();

        // //     for(int j=0;j<len;j++){
        // //         String s = mp.getKey(i);
        // //         StringBuilder sb = new StringBuilder(s);
        // //         sb.setCharAt(j,'*');
                
        // //         mp.put(s,mp.getValue(i).append(sb));
                
        // //     }
        // // }

        //  for(String k: mp.keySet()){
        //     System.out.println(k+" "+mp.get(k));
        //  }

        //  Queue<String> q = new ArrayDeque<>();
        //  Set<String> visited = new HashSet<>();

        // q.offer(beginWord);
        // visited.add(beginWord);
        // int level = 1;

        // while(!q.isEmpty()){
        //     int size = q.size();

        //     for (int i = 0; i < size; i++) {
        //         String word = q.poll();
        //         if (word.equals(endWord)) return level;
        //         for(int j=0;j<word.length();j++){

        //             String pattern = word.substring(0, j) + "*" + word.substring(j + 1);


        //             for(String neighbor: mp.getOrDefault(pattern, new ArrayList<>())){
        //             if(!visited.contains(neighbor)){    //imp
        //                 visited.add(neighbor);
        //                 q.offer(neighbor);
        //             }
        //         }

        //         }
                

        //     }
        //     level++;
        // }

        

        // return 0;

        Map<String, List<String>> mp = new HashMap<>();

        wordList.add(beginWord);

        for(String word: wordList){
            for(int j=0;j<word.length();j++){
                StringBuilder sb = new StringBuilder(word);

                String pattern = sb.substring(0,j)+"*"+sb.substring(j+1);

                mp.putIfAbsent(pattern,new ArrayList<>());

                mp.get(pattern).add(word);
            }
        }

        Queue<Pair> q = new ArrayDeque<>();

        Set<String>visited = new HashSet<>();
        q.offer(new Pair(beginWord,1));
        visited.add(beginWord);
        int minMoves = Integer.MAX_VALUE;

        while(!q.isEmpty()){
            Pair p = q.poll();
            String w = p.word;
            int m = p.moves;

           if (w.equals(endWord)) {
    return m;
}

            for(int j =0;j<w.length();j++){
                 StringBuilder sb = new StringBuilder(w);

                String pattern = sb.substring(0,j)+"*"+sb.substring(j+1);

                for(String nei: mp.get(pattern)){
                    if(!visited.contains(nei)){
                        visited.add(nei);
                        q.offer(new Pair(nei,m+1));
                    }
                }

            }
        }


        return 0;
       
        
    }
}
