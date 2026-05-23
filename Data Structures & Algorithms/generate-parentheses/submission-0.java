class Solution {
    public List<String> generateParenthesis(int n) {

        List<String> res = new ArrayList<>();
        Stack<Character> st = new Stack<>();
        backtrack(0,0,n, res, st);
        return res;

        
    }

    public void backtrack(int open,int close, int n, List<String> res, Stack<Character> st){
        if(open<n){
            st.push('(');
            backtrack(open+1,close,n,res,st);
            st.pop();
        }
        if(close<open){
            st.push(')');
            backtrack(open,close+1,n,res,st);
            st.pop();
        }

        if(open==n && close==n){
            StringBuilder sb = new StringBuilder();
            for (char ch : st) {
                sb.append(ch);
            }
            res.add(sb.toString());
            return;
        }
    }
}
