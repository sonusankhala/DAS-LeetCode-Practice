class Solution {
    public int searchInsert(int[] nums, int target) {
      //  int x=0;
        if(nums[nums.length-1]<target){
            return nums.length;
        }
        int l=0;
        int n=nums.length-1;
        while(l<=n){
            int m=(l+n)/2;
            if(nums[m]>target){
               n=m-1;
            }else if(nums[m]==target){
                return m;
                
            }else {
                l=m+1;
            }
        }
        return l;
        
        /*
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
        */
    }
}
