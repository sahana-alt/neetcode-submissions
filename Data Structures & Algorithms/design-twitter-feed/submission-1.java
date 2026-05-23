class Twitter {
     private static int count;
    HashMap<Integer,List<int[]>> userTweets;
    HashMap<Integer,HashSet<Integer>> userFollowers;
   

    public Twitter() {
        // this.count =0;   //imp:-
        this.userTweets = new HashMap<>();
        this.userFollowers = new HashMap<>();       
    }
    
    public void postTweet(int userId, int tweetId) {
        count++;
         userTweets.putIfAbsent(userId, new ArrayList<>());
         userTweets.get(userId).add(new int[]{tweetId,count});

  
        
        
    }
    
    public List<Integer> getNewsFeed(int userId) {
        PriorityQueue<int []> pq = new PriorityQueue<>((a,b)->b[1]-a[1]);

        if(userTweets.containsKey(userId)){
             for (int[] tweet : userTweets.get(userId)) {
                pq.offer(tweet);
             }
            
        }

         if (userFollowers.containsKey(userId)) {
            for (int followee : userFollowers.get(userId)) {
                 if (followee == userId) continue; // avoid duplicate
                if (userTweets.containsKey(followee)) {
                    for (int[] tweet : userTweets.get(followee)) {
                        pq.offer(tweet);
                    }
                }
            }
        }

        List<Integer> feed = new ArrayList<>();
        int posts = 0;
        while (!pq.isEmpty() && posts < 10) {
            feed.add(pq.poll()[0]); // get tweetId
            posts++;
        }

        return feed;


    }
    
    public void follow(int followerId, int followeeId) {
          userFollowers.putIfAbsent(followerId, new HashSet<>());
    userFollowers.get(followerId).add(followeeId);
        
    }
    
    public void unfollow(int followerId, int followeeId) {
       
       
    if(userFollowers.containsKey(followerId)) {
        userFollowers.get(followerId).remove(followeeId);
    }
}
}
        
    

