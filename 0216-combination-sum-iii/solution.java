class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        generatecomb3(arr, k, n, ans, 0, new ArrayList<Integer>());

        return ans;
    }

    void generatecomb3(int[] arr, int k, int n, List<List<Integer>> ans, int i, ArrayList<Integer> sub) {
       
            if (n == 0 && sub.size()==k) {
                ans.add(new ArrayList<>(sub));
                return;
            }
            //return;
        

        for (int j = i; j < arr.length; j++) {
            if (arr[j] > n || sub.size()>k) {
                break;
            }
            sub.add(arr[j]);
            generatecomb3(arr, k, n - arr[j], ans, j+1, sub);
            sub.remove(sub.size() - 1);
        }
    }

}
