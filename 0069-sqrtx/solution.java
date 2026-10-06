class Solution {
    public int mySqrt(int x) {
        if(x==0){
            return 0;
        }
        int l=1,r=x/2;
        int ans=1;
        while(l<=r){
            int m=(l+r)/2;
            long val=(long)m*m;

            if(val<=x){
                ans=m;
                l=m+1;
            }else {
                r=m-1;
            }
        }

        return ans;
        
    }
}
