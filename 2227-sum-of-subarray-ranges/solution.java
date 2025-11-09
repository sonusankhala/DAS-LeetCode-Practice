class Solution {
    public long subArrayRanges(int[] nums) {

        int n=nums.length;
        long sum=0;
        long h=Integer.MIN_VALUE;
        long l=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            h=nums[i];
            l=nums[i];
            for(int j=i+1;j<n;j++){
                h=Math.max(h,nums[j]);
                l=Math.min(l,nums[j]);
                sum+=(h-l);
            }
        }
        return sum;
    }
}
