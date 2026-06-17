class Solution {
    public boolean isMonotonic(int[] nums) {
        if(nums.length<=1){
            return true;
        }
        //boolean ans=ture;
        boolean inc=true;
        boolean dec=true;
        //int i=0, j=1;
        for(int i=1;i<nums.length;i++ ){
            if(!inc && !dec){
                return false;
            }
            if(nums[i]<nums[i-1]){
                inc=false;
            }
            if(nums[i]>nums[i-1]){
                dec=false;
            }
        }

        return inc || dec;
        
    }
}
