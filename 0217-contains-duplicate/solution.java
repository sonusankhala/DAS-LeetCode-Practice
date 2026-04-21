class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        boolean ans=false;
        for(int i=0;i<nums.length;i++){
            if(map.get(nums[i])!=null){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }   
        }
        
        for(Integer x:map.values()){
            if(x>1){
                ans=true;
                break;
            }
        }
        return ans;
        
    }
}
