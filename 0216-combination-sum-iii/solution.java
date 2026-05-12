class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {

        int [] arr={1,2,3,4,5,6,7,8,9};
        List<List<Integer>> ans=new ArrayList<>();
        sum3(0,k,n,arr,ans, new ArrayList<Integer>());
        return ans;
    }
    public void sum3(int ind, int k, int n, int [] arr,List<List<Integer>> ans, List<Integer> ds){
        if(n==0 && ds.size()==k){
           ans.add(new ArrayList<>(ds));
           return;
        }
        for(int i=ind;i<arr.length;i++){
            if(arr[i]>n || ds.size()>k){
                break;
            }
            ds.add(arr[i]);
            sum3(i+1, k, n-arr[i], arr, ans, ds);
            ds.remove(ds.size()-1);
        }
    }
}
