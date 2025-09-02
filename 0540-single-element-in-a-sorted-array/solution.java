class Solution {
    public int singleNonDuplicate(int[] nums) {
       /*
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

        */
        int n = nums.length;
        if( n==1) return nums[0];
        if(nums[0] != nums[1]) return nums[0];
        if(nums[n-1] != nums[n-2]) return nums[n-1];
        int low = 1;
        int high= n-2;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(nums[mid] != nums[mid+1] && nums[mid] != nums[mid-1]) return nums[mid];
            if((mid%2 == 1 && nums[mid-1] == nums[mid]) || (mid % 2 == 0 && nums[mid +1 ] == nums[mid] )){
                low = mid + 1 ;

            } else{
                high = mid -1;
            }
        } 
        return -1;      
    }
}
