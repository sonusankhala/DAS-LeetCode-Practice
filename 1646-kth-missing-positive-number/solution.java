class Solution {
    public int findKthPositive(int[] arr, int k) {
/*
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=k){
                k++;
            }else{
                break;
            }
        }
        return k;
        */
        int i=0, j=arr.length-1;

        while(i<=j){
            int m=(i+j)/2;
            int mis=arr[m]-(m+1);
            if(mis<k){
                i=m+1;
            }else{
                j=m-1;
            }
        }
        return k+i;
    }
}
