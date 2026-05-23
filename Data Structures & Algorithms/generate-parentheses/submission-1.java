class Solution {
    public List<String> generateParenthesis(int n) {
      //use stack or do directly
      //if u use stack use open ==n & close == n as stopping condition
        List<String> sList = new ArrayList<>();    
        generateParenthesisRecursion(n, 0,0, sList, new StringBuilder());

        return sList;
        
    }

    public void generateParenthesisRecursion(int n, int open, int close,
    List<String> sList,StringBuilder sb){
        //2 conditions
        //1- open < n then open
        //2- open > close then close
        
        if(open <n){
            sb.append('(');
            generateParenthesisRecursion(n, open+1, close, sList, sb );
            sb.deleteCharAt(sb.length() - 1);
        }
        if(open>close){
            sb.append(')');
            generateParenthesisRecursion(n, open, close+1, sList, sb );
            sb.deleteCharAt(sb.length() - 1);

        }

        if(sb.length()>= 2*n){  
            sList.add(sb.toString());
            return;
        }

    }
}
