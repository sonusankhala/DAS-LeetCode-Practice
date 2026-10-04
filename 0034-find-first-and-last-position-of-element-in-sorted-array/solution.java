class Solution {
    public int[] searchRange(int[] nums, int target) {
        return new int [] {firstOcc(nums,target),lastOcc(nums,target)};
    }
       public int firstOcc(int[] nums, int target){
            int l=0;
            int h=nums.length-1;
            int i=-1;
            while(l<=h){
                int m=(l+h)/2;
                if(nums[m]==target){
                    i=m;
                    h=m-1;
                }else if(nums[m]<target){
                    l=m+1;
                }else{
                    h=m-1;
                }
            }
            return i;

        }
       public int lastOcc(int[] nums, int target){
            int l=0;
            int h=nums.length-1;
            int i=-1;
            while(l<=h){
                int m=(l+h)/2;
                if(nums[m]==target){
                    i=m;
                    l=m+1;
                }else if(nums[m]<target){
                    l=m+1;
                }else{
                    h=m-1;
                }
            }
            return i;
        }
    
}
