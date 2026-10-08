class Solution {
    public int myAtoi(String str) {

        String s=str.trim();
        

        int i=0;
        int sign=1;
        long ans=0;
        int n=s.length();
        if(n<=0){
            return 0;
        }

        if(s.charAt(i)=='-'){
            sign=-1;
            i++;
        }else if(s.charAt(i)=='+'){
            sign=1;
            i++;
        }
        while(i<n && Character.isDigit(s.charAt(i))){
            ans=ans*10+(s.charAt(i)-'0');

            if(ans*sign>Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }
            if(ans*sign<Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
            i++;
        }

        return (int)(sign*ans);
        
    }
}
