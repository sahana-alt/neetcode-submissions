class Solution {
    public List<List<String>> partition(String s) {

        List<String> l = new ArrayList<>();
        List<List<String>> res = new ArrayList<>();

        dfs(s, 0, l, res);

        return res;

       
        
    }

    public void dfs(String s, int index, List<String> l, List<List<String>> res){

        if(index == s.length()){
            res.add(new ArrayList<>(l));
            return;
        }

        for(int i=index;i<s.length();i++){
            // if(isPali(s,index,i)){
            //     String sub = s.substring(index,i+1);
            //     l.add(sub);
            //     dfs(s,i+1,l,res);// i+1 not index+1
            //     l.remove(l.size()-1);
            // }

            if(isPali(s,index,i)){
                l.add(s.substring(index,i+1));
                dfs(s,i+1,l,res);
                l.remove(l.size()-1);
            }
            
        }

    }

    private boolean isPali(String s, int st, int e){
        while(st<e){
            if(s.charAt(st)!=s.charAt(e)){
                return false;
            }
            st++;
            e--;
        }
        return true;
    }
}
