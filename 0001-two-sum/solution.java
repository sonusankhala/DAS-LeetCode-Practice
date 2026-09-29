class Solution {
    public int[] twoSum(int[] nums, int k) {
        int n=nums.length;
        int l=0,r=0;
        Map <Integer, Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            int a=nums[i];
            int rem=k-a;
            if(map.containsKey(rem)){
               r=i;
               l=map.get(rem);
               break;
            }
            if(!map.containsKey(rem)){
                map.put(a,i);
            }
        }
        return new int[] {l,r};
    }
}
