class Solution {
    public int majorityElement(int[] nums) {
        
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        int max=Integer.MIN_VALUE;
        
        for(int i=0;i<nums.length;i++){
            int count=1;
            if(map.containsKey(nums[i])){
                count=map.get(nums[i])+1;
                map.put(nums[i],count);
            }
            if(!map.containsKey(nums[i])){
                map.put(nums[i],count);
            }
            if(count>(nums.length/2)){
                max=nums[i];
            }
        }
        return max;
    }
}
