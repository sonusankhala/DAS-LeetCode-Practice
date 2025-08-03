class Solution {
    public void reverseString(char[] s) {
        rev(s,0,s.length-1);
        
    }
    static void rev(char[] s, int i, int j){
        if(i>j){ return; }
        char t=s[i];
        s[i]=s[j];
        s[j]=t;
        rev(s, i+1,j-1);
    }
}
