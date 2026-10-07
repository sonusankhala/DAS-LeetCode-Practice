class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int l=1;
        int r=0;
        for(int i:piles){
            r=Math.max(r,i);
        }
      //  int ans=0;
       // System.out.println("R: "+r);
        while(l<=r){
            int m=(l+r)/2;
            long time=(long)funct(piles,m);
         //   System.out.println(time);
            if(time<=h){
             //   ans=m;
                r=m-1;
            }else{
                l=m+1;
            }
        }
        return l;
        
        
    }

    int funct(int [] piles, int m){
        int sum=0;
        for(int i=0;i<piles.length;i++){
            sum+=Math.ceil((double)piles[i]/m);
          //  System.out.println("Sum: "+sum+ " Index:: "+i);
        }
        return sum;
    }
}
