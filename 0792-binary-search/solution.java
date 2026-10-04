class Solution {
    public int search(int[] nums, int target) {
        int h=nums.length-1;
        int l=0;
        int x=-1;
       
        while(l<=h){
             int m=l+(h-l)/2;
             if(nums[m]>target){
                h=m-1;
             }else if(nums[m]<target){
                l=m+1;
             }else{
                x=m;
                break;
             }
        }
        return x;
        
    }
}
