class Solution {
    public int smallestDivisor(int[] piles, int threshold) {

       /* int max=Integer.MIN_VALUE;
        for(int i=0; i<piles.length;i++){
            max=Math.max(max,piles[i]);
        }
        */

        int l=1;
        int r=1000000;
        while(l<=r){
            int mid=(l+r)/2;
           // int x=checkSum(piles,mid,threshold);
            if(checkSum(piles,mid,threshold)){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return l;

        
    }

    public boolean checkSum(int piles[], int mid, int t){
        int sum=0;
        for(int i=0;i<piles.length;i++){
            sum+=Math.ceil((double)(piles[i])/mid);
        }
        return (sum>t)?false:true;
    }
}
