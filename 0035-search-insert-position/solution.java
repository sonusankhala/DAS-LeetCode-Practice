class Solution {
    public int searchInsert(int[] nums, int target) {
        int x=0;
        if(nums[nums.length-1]<target){
            return nums.length;
        }
       for(int i=0;i<nums.length;i++){
        if(nums[i]==target){
            x=i;
            break;
        }if(nums[i]>target){
            x=i;
            break;
        }
       }
        return x;
    }
}
