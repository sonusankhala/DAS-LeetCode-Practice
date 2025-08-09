class Solution {
    public boolean check(int[] nums) {

        int f=nums[0];
        boolean ans=true;
        int x=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<nums[i-1]){
                x++; 
                if(x>1){ return false;}
            }

        }
        if(nums[0]<nums[nums.length-1]){
            x++;
        }
        return x<=1;
    }
}
