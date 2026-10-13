class Solution {
    public List<List<Integer>> combinationSum(int[] arr, int target) {

        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> sub=new ArrayList<>();
        generateCom(arr, ans,target, 0,sub);
        return ans;  
    }
    void generateCom(int [] arr, List<List<Integer>> ans, int t, int i,List<Integer> sub){
        if(i==arr.length){
            if(t==0){
                ans.add(new ArrayList<>(sub));
            }
            return;
        }
        if(arr[i]<=t){
            sub.add(arr[i]);
            generateCom(arr, ans, t-arr[i],i,sub);
            sub.remove(sub.size()-1);
        }
        generateCom(arr, ans, t,i+1,sub);
    }
}
