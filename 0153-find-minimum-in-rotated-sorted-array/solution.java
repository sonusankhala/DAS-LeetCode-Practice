class Solution {
    public int findMin(int[] nums) {
        /*
        int m=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            m=Math.min(nums[i],m);
        }
        return m;
        */
         
         
        int low = 0;
        int high = nums.length-1;
        int min = Integer.MAX_VALUE;
        while(low <= high){
            int mid = low + (high - low)/2;

            min = Math.min(min, nums[mid]);
            //Left Sorted
            if(nums[low] <= nums[mid]){
                min = Math.min(min, nums[low]);
                low = mid + 1;
            }
            //Right Sorted
            else{
                min = Math.min(min, nums[high]);
                high = mid - 1;
            }
        }
        return min;


    }
}
