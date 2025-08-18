class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        int x=0,y=0;
        
        for(int n:nums){
            if(n==1){
                x++;
            }else{
                y=Math.max(x,y);
                x=0;
            }
            
        }
        return Math.max(x,y);
        
    }
}
