class Solution {
    public String removeOuterParentheses(String s) {

        int x=0;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                if(x>0){
                    sb.append(s.charAt(i));
                }
                x++;
            }else{
                x--;
                if(s.charAt(i)==')'){
                   if(x>0){
                    sb.append(s.charAt(i));
                }
                }
            }
        }
        return sb.toString();
        
    }
}
