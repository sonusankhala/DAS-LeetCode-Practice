class Solution {
    public int[] rearrangeArray(int[] nums) {

        int p=0,n=0;

        int pog[]=new int[nums.length/2];
        int neg[]=new int[nums.length/2];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                pog[p]=nums[i];
                p++;
            }else{
               neg[n]=nums[i];
                n++; 
            }
        }
        int p1=0,n1=0;

        for(int i=1;i<=nums.length;i++){
            if(i%2!=0){
                nums[i-1]=pog[p1];
                p1++;
            }else{
                nums[i-1]=neg[n1];
                n1++;
            }
        }

        return nums;
        
    }
}
