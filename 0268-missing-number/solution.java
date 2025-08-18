class Solution {
    public int missingNumber(int[] nums) {
        
        /*
        int x=0;
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            arr.add(nums[i]);
        }
        for(int i=0;i<=nums.length;i++){
            if(!arr.contains(i)){
             x=i;
            }
        }

        return x;
        */

        int n=nums.length;
        int sum=n*(n+1)/2;
        int a=0;
        for(int nu:nums){
            a+=nu;
        }
        return sum-a;
    }
}
