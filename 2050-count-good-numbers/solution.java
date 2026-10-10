class Solution {
    private static final long mod=1000000007L;
    public int countGoodNumbers(long n) {


        long evenPow=(n+1)/2;
        long oddPow=n/2;

        long evenNum=modPow(5,evenPow);
        long oddNum=modPow(4,oddPow);

        return (int)(evenNum *oddNum %mod);
        
    }

    long modPow(long i, long pow){
        long result=1;
        while(pow>0){
             if(pow%2==1){
            result=(result*i)%mod;
        }
        i=(i*i)%mod;
        pow /=2;

        }
        return result;
    }
}
