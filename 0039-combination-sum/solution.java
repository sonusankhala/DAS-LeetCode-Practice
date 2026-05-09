class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> ds=new ArrayList<>();
        comb(0,candidates,target,ans,ds);
        return ans;
    }
    public void comb(int i,int [] arr, int t, List<List<Integer>> ans,List<Integer> ds){
        if(i==arr.length){
            if(t==0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        if(arr[i]<=t){
            ds.add(arr[i]);
            comb(i, arr, t-arr[i], ans, ds);
            ds.remove(ds.size()-1);
        }
        comb(i+1, arr, t,ans,ds);
    }
}
