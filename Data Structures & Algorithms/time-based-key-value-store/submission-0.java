class TimeMap {
    //add instead of append
    // array initialisation
    //if key first in get
    //removed else in put
    //compute if absent check
    //lastline .get(key).get(index)
    HashMap<String, List<String>> mp_value;
    HashMap<String, List<Integer>> mp_time;
    public TimeMap() {
        mp_value = new HashMap<>();
        mp_time = new HashMap<>();
        
    }
    
    public void set(String key, String value, int timestamp) {
        if(!mp_value.containsKey(key)){
            mp_value.put(key, new ArrayList<>());
        }
       mp_value.get(key).add(value);
        
        if(!mp_time.containsKey(key)){
            mp_time.put(key, new ArrayList<>());
        }
        
        mp_time.get(key).add(timestamp);
      
    }
    
    public String get(String key, int timestamp) {
        if (!mp_value.containsKey(key)) return "";
        
        int l = 0;
        int h = mp_time.get(key).size()-1;
        int max =-1;
        List<Integer> list;
       
        list= mp_time.get(key);
        while(l<=h){
            
            int m = l+((h-l)/2);
            
            if(list.get(m)<=timestamp){
                max = m;
                l=m+1;
            }else{
                h=m-1;
            }
        }
        
        return max == -1?"": mp_value.get(key).get(max);
    }
}
