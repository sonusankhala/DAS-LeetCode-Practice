class Solution {
    public int singleNonDuplicate(int[] nums) {
        if(nums.length<=1){
            return nums[0];
        }
        int x=0;
        for(int i=1;i<nums.length-1;i++){
              if(nums[i]==nums[i-1] || nums[i]==nums[i+1]){
                continue;
              }else{
            x= nums[i];
              }
        }
        if(x==0 && nums[nums.length-1]!=nums[nums.length-2]){
            x=nums[nums.length-1];
        }
        if(x==0 && nums[0]!=nums[1]){
            x=nums[0];
        }
        return x;
    }
}
