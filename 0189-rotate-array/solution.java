class Solution {
    public void rotate(int[] nums, int k) {

        int n=nums.length;
        k=k%n;
        if (k == 0) return;
        int arr[] =new int[k];
        for(int i=n-k;i<n;i++){
            arr[i-(n-k)]=nums[i];
        }

        for(int i=n-k-1;i>=0;i--){
            nums[i+k]=nums[i];
            
        }
        for(int i=0;i<k;i++){
            nums[i]=arr[i];
        }
        
        //return nums;
       
     
        /*
        k %= nums.length;
         int n = nums.length;
         reverseNum(nums,0,n-k-1);
         reverseNum(nums,n-k,n-1);
         reverseNum(nums,0,n-1);
         */
         
    }

    public void reverseNum(int[] nums, int start, int end) {
        while(start < end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
        start++;
        end--;
        }
}
}
