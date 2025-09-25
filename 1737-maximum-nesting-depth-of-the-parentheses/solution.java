class Solution {
    public int maxDepth(String st) {

     //Stack<String> stack = new Stack<String>();
     int c=0;
     int x=0;
     for(int i=0;i<st.length();i++){
        if(st.charAt(i)=='('){
          x++;
          c=Math.max(c,x);
        }else if(st.charAt(i)==')'){
            x--;
        }
     }
     return c;


    }
}
