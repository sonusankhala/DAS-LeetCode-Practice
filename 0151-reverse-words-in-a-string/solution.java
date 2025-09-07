class Solution {
    public String reverseWords(String s) {


       StringBuilder ans = new StringBuilder();
        String [] str=s.split(" ");
        for(int i=str.length-1;i>=0;i--){
          if(str[i].length()!=0){
             ans.append(str[i]+" ");
          }   
        }
        return ans.toString().trim();
        
    }
}
