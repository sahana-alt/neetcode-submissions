class Solution {
    List<String> res = new ArrayList<>();
         String[] map = {
            "", "", "abc", "def", "ghi",
            "jkl", "mno", "pqrs", "tuv", "wxyz"
        };
        //better to declare these 2 here or u should pass in fn call
    public List<String> letterCombinations(String digits) {

        if(digits == null || digits.length()==0){
            return res;
        }
        

        dfs(0,digits,new StringBuilder());

        return res;
        
    }

    private void dfs(int index, String digits, StringBuilder s){
        if(index == digits.length()){
            res.add(s.toString());
            return;
        }

        String letters = map[digits.charAt(index)-'0'];

        for (char ch: letters.toCharArray()){
            s.append(ch);
            dfs(index+1, digits, s);
            s.deleteCharAt(s.length()-1);
        }
    }
}
