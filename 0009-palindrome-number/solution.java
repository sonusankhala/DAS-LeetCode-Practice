class Solution {
    public boolean isPalindrome(int x) {

        int n=Math.abs(x);

        int rev=0;
        while(n!=0){
            int rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }

        return (x<0 || rev!=x)? false: true;
        
    }
}
