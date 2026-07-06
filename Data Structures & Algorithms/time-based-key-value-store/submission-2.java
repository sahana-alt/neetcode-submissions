public class Pair{
    String s;
    int n;

    public Pair(String s, int n){
        this.s = s;
        this.n = n;
    }
}

class TimeMap {

    HashMap<String, List<Pair>> mp;

    public TimeMap() {
        mp = new HashMap<>();
        
    }
    
    public void set(String key, String value, int timestamp) {
        Pair p = new Pair(value,timestamp);
        if(!mp.containsKey(key)){
  
            mp.put(key, new ArrayList<>());
        }
        mp.get(key).add(p);    
    }
    
    public String get(String key, int timestamp) {
         if (!mp.containsKey(key)) {
            return "";
        }

        int maxi = Integer.MIN_VALUE;
        // String ans = "";
 
        // for(Pair p: mp.get(key)){
        //        if(p.n <= timestamp && p.n>maxi){
        //         maxi = p.n;
        //         ans = p.s;
        //        }
        //    }

        List<Pair> list = mp.get(key);
        int len = list.size();
        String ans = "";

        int l = 0, h = len -1;


        while(l<=h){
            int m = l+(h-l)/2;
            int curT = list.get(m).n;

            if(curT<=timestamp){
                ans = list.get(m).s;
                l=m+1;
            }else{
                h=m-1;
            }
        }
          
 
         return ans;
        
    }
}
