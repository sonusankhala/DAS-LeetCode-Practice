class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {

     /*
        int count=0;
        for(int i=0;i<nums.length;i++){
            int s=0;
            for(int j=i; j<nums.length;j++){
                s+=nums[j];
                if(s==goal){
                    count++;
                }
                if(s>goal){
                    break;
                }
            }
        }
        return count;

        */
        return find(nums, goal)-find(nums, goal-1);
       // return 
    }

    int find(int [] nums, int g){
        int l=0, r=0,c=0,s=0;
        int n=nums.length;
        while(r<n){
            if(g<0){
                return 0;
            }
           s+=nums[r];
           while(s>g && l<=r){
            s-=nums[l];
            l++;
           }
           c+=r-l+1;
           r++;
        }
        return c;
    }
}
