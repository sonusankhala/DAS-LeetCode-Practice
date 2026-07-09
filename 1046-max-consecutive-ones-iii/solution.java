class Solution {
    public int longestOnes(int[] nums, int k) {

        int l=0,r=0;
        int z=0;
        int n=nums.length;
        int maxlen=0;
        while(r<n){
             if(nums[r]==0){
                z++;
            }
            if(z<=k){
            int len=r-l+1;
            maxlen=Math.max(maxlen,len);
            }else{
                if(nums[l]==0){
                    z--;
                }
                l++;
            } 
             r++;
        }
        return maxlen;
        
    }
}
