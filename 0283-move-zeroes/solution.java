class Solution {
    public void moveZeroes(int[] arr) {
       
       /* int j=0;
        for(int i=0;i<n;i++){
           
           if(arr[i]!=0){
            int t=arr[i];
            arr[i]=arr[j];
            arr[j]=t;
            j++;
           }
        }
        */
         int l = 0,r =0;
        while(r < arr.length){
            if(arr[r] != 0){
                int temp =  arr[r];
                arr[r] = arr[l];
                arr[l] = temp;
                l++;
            }
            r++;
        }
        
    }
}
