class Solution {
    public boolean isPalindrome(String s) {

        if(s.length()<=0){
            return true;
        }
        String st=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int [] arr= {1};
        pal(st, 0,st.length()-1, arr);
        return (arr[0]==1?true:false);
    }

    public static void pal(String s, int i, int j, int [] arr){
        if(i>j){return;}
        if(s.charAt(i)!=s.charAt(j)){
            arr[0]=0;
            return;
        }
        pal(s,i+1,j-1,arr);
    }
}
