class Solution {
    public int majorityElement(int[] nums) {

        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            }else{
                 map.put(nums[i],1);
            }
        }
        int n=nums.length/2;
        int a=0;
        for(int i:nums){
            if(map.get(i)>n){
              a=i;
            }
        }
        return a;
        
    }
}
