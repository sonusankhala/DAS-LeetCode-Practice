class Solution {

    public List<List<Integer>> subsets(int[] nums) {
        /*
        int n=nums.length;
        int p=(int)Math.pow(2,n);
        List<List<Integer>> sub = new ArrayList<>();
        for(int i=0;i<p;i++){
            List<Integer> arr=new ArrayList<>();
            for(int j=0;j<n;j++){
                if((i&(1<<j))!=0){
                    arr.add(nums[j]);
                }
            }
            sub.add(arr);
        }
        return sub; 
        */
        List<List<Integer>> sub = new ArrayList<>();
         List<Integer> arr=new ArrayList<>();
         createSub(nums,0,sub,arr);
         return sub;
    }

    public void createSub(int nums[], int i, List<List<Integer>> sub, List<Integer> arr){
        if(i==nums.length){
            sub.add(new ArrayList<>(arr));
            return;
        }
        arr.add(nums[i]);
        createSub(nums,i+1,sub,arr);
        arr.remove(arr.size()-1);
        createSub(nums,i+1,sub,arr);
    }
}
