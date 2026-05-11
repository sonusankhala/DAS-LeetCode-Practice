class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(candidates);
        findComb2(0,candidates,target,ans , new ArrayList<Integer>());
        return ans;
    }

    public void findComb2(int ind,int [] arr, int t,List<List<Integer>> ans, List<Integer> ds){
        if(t==0){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=ind;i<arr.length;i++){
            if(i>ind && arr[i]==arr[i-1]){
                continue;
            }
            if(arr[i]>t){
                break;
            }
            ds.add(arr[i]);
            findComb2(i+1,arr,t-arr[i],ans,ds);
            ds.remove(ds.size()-1);
        }
    }
}
