class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {

   Arrays.sort(nums);
        Set<List<Integer>> set=new HashSet<>();
        List<List<Integer>> ans=new ArrayList<>();

        findSubset(nums,0,nums.length,set, new ArrayList<Integer>());
       ans.addAll(set);
       return ans;
    }
    public void findSubset(int [] nums, int i,int N, Set<List<Integer>> set, ArrayList<Integer> ds){
        if(i==N){
            set.add(new ArrayList<>(ds));
            return;
        }
        ds.add(nums[i]);
        findSubset(nums,i+1,N,set,ds);
        ds.remove(ds.size() - 1);
        findSubset(nums,i+1,N,set,ds);
    }
    
    /*
    Arrays.sort(nums);
    List<List<Integer>> ans=new ArrayList<>();
    findsub(0,nums,ans,new ArrayList<>());
    return ans;
    }

    public void findsub(int ind, int [] nums,List<List<Integer>> ans, ArrayList<Integer> ds){
        ans.add(new ArrayList<>(ds));
        for(int i=ind; i<nums.length;i++){
            if(i!=ind && nums[i]==nums[i-1]){
                continue;
            }
            ds.add(nums[i]);
            findsub(i+1, nums, ans, ds);
            ds.remove(ds.size()-1);
        }
    }
    */


}
