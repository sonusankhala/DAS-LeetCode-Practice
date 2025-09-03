class Solution {
    public int minDays(int[] piles, int m, int k) {

       if ((long) m * k > piles.length) {
            return -1;
        }

        int max=Integer.MIN_VALUE;
        for(int i=0; i<piles.length;i++){
            max=Math.max(max,piles[i]);
        }

        int l=1;
        int ans=0;
        int r=max;
        while(l<r){
            int mid=(l+r)/2;
           // int x=checkSum(piles,mid,m,k);
            if(checkSum(piles,mid,m,k)){
                r=mid;
                //ans=mid;
            }
            else{
                l=mid+1;
            }
        }
        return l;

        
    }

    public boolean checkSum(int piles[], int day, int m, int k){
        int total = 0;

        for (int i = 0; i < piles.length; i++) {
            int count = 0;
            while (i < piles.length && count < k && piles[i] <= day) {
                count++;
                i++;
            }

            if (count == k) {
                total++;
                i--;
            }

            if (total >= m) {
                return true;
            }
        }

        return false;
    }
}
