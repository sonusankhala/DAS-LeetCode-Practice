class Solution {
    public int singleNumber(int[] nums) {
       
       /*
        Arrays.sort(nums);
        int x=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                x+=nums[i];
            }else{
                x-=nums[i];
            }
        }
        return x;
        */
        int ans = 0;
        for(int num : nums) ans ^= num;
        return ans;
    }
}
