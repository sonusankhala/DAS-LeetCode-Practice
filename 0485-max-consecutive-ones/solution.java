class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        int a=0,b=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                a++;
            }else{
                b=Math.max(a,b);
                a=0;
            }
        }
        return Math.max(a,b);
    }
}
