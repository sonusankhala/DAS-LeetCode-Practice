class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int l=1;
        int r=1000000;
        while(l<=r){
            int m=(l+r)/2;
            if(checkSum(nums,m, threshold)){
                r=m-1;
            }else{
                l=m+1;
            }
        }
        return l; 
    }

    boolean checkSum(int [] nums, int m, int t){
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=Math.ceil((double)nums[i]/m);
        }
        return sum>t?false:true;
    }
}
