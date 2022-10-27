class Solution {
    public int findMaxK(int[] nums) {
        
            
    HashSet<Integer> st = new HashSet<>();
    for (int i : nums) st.add(i);
    int res = -1;
    for (int p : nums)
	     if (p > 0 && st.contains(-p)) res = Math.max(res, p);
    return res;
        
       /*
        int max=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max && checkNeg(nums,nums[i])){
                max=Math.max(max,nums[i]);
            }
        }
        return max;
        */
    }
    /*
    public boolean checkNeg(int[] nums,int x){
        boolean ans=false;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==-x){
                ans=true;
            }
        }
        return ans;
    }
    */
    
}
