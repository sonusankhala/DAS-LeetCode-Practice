class Solution {
    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();

        List<Integer> sub = new ArrayList<>();

        generatePowerSet(nums, ans, sub, 0);

        return ans;
        
    }

    void generatePowerSet(int [] nums,  List<List<Integer>> ans, List<Integer> sub, int n){

        if(n==nums.length){
            ans.add(new ArrayList<>(sub));
            return;
        }
        sub.add(nums[n]);
        System.out.println(sub.toString());
        generatePowerSet(nums, ans, sub, n+1);
        sub.remove(sub.size()-1);
        System.out.println(sub.toString());
        generatePowerSet(nums, ans, sub, n+1);
        System.out.println(sub.toString());
    }
}
