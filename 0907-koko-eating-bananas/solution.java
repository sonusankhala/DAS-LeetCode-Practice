class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int max=Integer.MIN_VALUE;
        for(int i=0; i<piles.length;i++){
            max=Math.max(max,piles[i]);
        }

        int l=1;
        int r=max;
        while(l<=r){
            int mid=(l+r)/2;
            int x=checkSum(piles,mid);
            if(x<=h){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return l;

        
    }

    public int checkSum(int piles[], int mid){
        int sum=0;
        for(int i=0;i<piles.length;i++){
            sum+=Math.ceil((double)(piles[i])/mid);
        }
        return sum;
    }
}
