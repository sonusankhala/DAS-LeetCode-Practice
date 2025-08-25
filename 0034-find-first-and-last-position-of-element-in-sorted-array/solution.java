class Solution {
    public int[] searchRange(int[] nums, int target) {
        if(nums.length<1){
            return new int [] {-1,-1};
        }
        int x=0;
        int y= nums.length-1;
        int a=Integer.MAX_VALUE, b=-1;
        int m=x+(y-x)/2;
          if(nums[m]<target){
            for(int i=m;i<=y;i++){
                if(nums[i]==target){
                    a=Math.min(a,i);
                    b=Math.max(b,i);
                }
            }
          }
          else{
            for(int i=0;i<=y;i++){
                if(nums[i]==target){
                    a=Math.min(a,i);
                    b=Math.max(b,i);
                }
          } 
         }
         if(a==Integer.MAX_VALUE){
            a=-1;
         }
        
         return new int[] {a,b};
    }
}
