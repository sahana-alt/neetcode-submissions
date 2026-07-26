class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Set<List<Integer>> res = new HashSet<>();
        List<Integer> l = new ArrayList<>();
       
        Arrays.sort(candidates);
        combinationList(candidates, 0, target, res, l);
        return new ArrayList<>(res);
      
        
    }

    public void combinationList(int[] candidates,int index, int target, Set<List<Integer>> res, List<Integer> l ){
        if(target == 0){
            res.add(new ArrayList<>(l));
            return;
        }

        if(target< 0 || index>= candidates.length){
           return;

        }

        for(int i = index;i<candidates.length;i++){

            if(i>index && candidates[i] == candidates[i-1]) continue;
            if(candidates[i]>target) break;
            l.add(candidates[i]);
            combinationList(candidates, i+1, target-candidates[i], res, l);
            l.remove(l.size()-1);
            // combinationList(candidates, i+1, target, res, l);

        }

        // l.add(candidates[index]);
        // combinationList(candidates, index+1, target-candidates[index], res,l);
        // //index shopuld increment as u cant ave same numbers in list
        // l.remove(l.size()-1);

        // int nextind = index+1;

        // while(nextind<candidates.length && candidates[index] == candidates[nextind]){
            
        //     //cond order up  and &&
        //     //inbound condition
        //     nextind++;
        // }
        // combinationList(candidates, nextind, target, res,l);
    }
}