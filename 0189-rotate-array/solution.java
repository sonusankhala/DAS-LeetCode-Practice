class Solution {
    public void rotate(int[] nums, int k) {
       
       /*
        int n=nums.length;
        for(int i=0;i<k;i++){
            int cur=n-1;
            int z=nums[n-1];
            for(int j=n-2;j>=0;j--){
                nums[cur]=nums[j];
                cur--;
            }
            nums[0]=z;
        }
        */
        k %= nums.length;
         int n = nums.length;
         reverseNum(nums,0,n-k-1);
         reverseNum(nums,n-k,n-1);
         reverseNum(nums,0,n-1);
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
