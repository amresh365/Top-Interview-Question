class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> bracket = new Stack<>();
        StringBuilder sb = new StringBuilder("");
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                if(bracket.size()>0){//If size of stack is greater than zero the we add the Char in StringBuilder
                    sb.append(s.charAt(i));
                }
                bracket.push(s.charAt(i));
            }else{
                bracket.pop();//If in case ')' firstly remove one item from the top of stack
                if(bracket.size()>0){//If size of stack is greater than zero the we add the Char in StringBuilder
                    sb.append(s.charAt(i));
                }
            }
        }
        return sb.toString();
    }
}