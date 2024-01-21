class Solution {
    public int mySqrt(int x) {
        int s=1;
        int y=x;
        int m=-1;

        if(x==0 || x==1){
            return x;
        }
        while(s<=y){
            m=s+(y-s)/2;
            if((long)m*m>(long)x){
                    y=m-1;
            }else if(m*m==x){
                    return m;
            }else{
                s=m+1;
            }
         }
         return y;
    }
}
