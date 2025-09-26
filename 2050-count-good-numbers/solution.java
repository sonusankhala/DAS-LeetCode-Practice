class Solution {
    public int countGoodNumbers(long n) {
      int mod = 1000000007;
      return (int)(pow(5,(n+1)/2, mod) * pow(4,n/2, mod)%mod); 
    }
    public long pow(long x, long n, int mod){
        
        // Base case for the recursion
        if(n==0) 
            return 1;
        
        // Recursively calculate x^(n/2)
        long temp = pow(x,n/2, mod);
        
        // If n is even, return (x^(n/2))^2
        if(n%2==0){
            return (temp * temp)% mod;
        }
        // If n is odd, return (x^(n/2))^2 * x
        else{
            return (x * temp * temp)% mod;
        }
    }
}
