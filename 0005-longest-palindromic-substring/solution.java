class Solution {
    public String longestPalindrome(String s) {
        if (s.length() <= 1) {
            return s;
        }
        int n=s.length();

        int maxLen = 1;
         String maxStr = s.substring(0, 1);
        for(int i=0;i<n;i++){
            for(int j=i+maxLen;j<=n;j++){
                if (j - i > maxLen && isPalindrome(s.substring(i, j))) {
                    maxLen = j - i;
                    maxStr = s.substring(i, j);
                }
            }
        }
        return maxStr;
        
    }

    boolean isPalindrome(String s){
        //if (s == null || s.length() < 1) return "";
        int l=0, r=s.length()-1;
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
