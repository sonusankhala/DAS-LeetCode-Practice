class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
/*
        int n=nums.length;
        int count=0;
        for(int i=0;i<n;i++){
          //  int len=0;
            int c=0;
            for(int j=i;j<n;j++){
               // len=j-i+1;
                if(nums[j]%2!=0){
                   c++;
                }else if(c>k){
                    break;
                }
                if(c==k){
                    count++;
                }
                
            }
         
        }
        return count;
        
        */
       return subArray(nums, k)-subArray(nums,k-1);
    }

    int subArray(int [] nums, int g){
        int l=0, r=0,c=0,s=0;
        int n=nums.length;
        while(r<n){
            if(g<0){
                return 0;
            }
           s+=nums[r]%2;
           while(s>g && l<=r){
            s-=nums[l]%2;
            l++;
           }
           c+=r-l+1;
           r++;
        }
        return c;
    }

    
}
