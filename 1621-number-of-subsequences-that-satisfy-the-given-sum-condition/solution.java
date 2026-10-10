class Solution {

    private static final int mod=1000000007;
    public int numSubseq(int[] nums, int target) {

       //  int mod = 1000000007 ,
         int n = nums.length;
        Arrays.sort(nums);
        
        int[] power = new int[n];
        power[0] = 1;
        for (int i = 1; i < n; i++) {
            power[i] = (power[i - 1] * 2) % mod;
        }
        int left = 0 , right = n - 1 , result = 0;

        while (left <= right) {
            if (nums[left] + nums[right] <= target) {
                result = (result + power[right - left]) % mod;
                left++;
            } else {
                right--;
            }
        }
        return result;








        /*

        login and ans correct but taking 2**n TC
        ArrayList<Integer> arr=new ArrayList<Integer>();

        return subSeq(nums,0, target,0,arr);
        */

    }

    int subSeq(int [] nums, int i, int t, int sum, ArrayList<Integer> arr){
        if(i==nums.length ){
           // System.out.println(arr.first() +" "+arr.last());
         //   int min = Collections.min(list);
       //     int max = Collections.max(list);
            if (arr.size()>0 && (Collections.min(arr)+Collections.max(arr))<=t){
                System.out.println(arr);
                return 1;
            }else{
                return 0;
            }
        }
       // int elementToTrack = nums[i];
        arr.add(nums[i]);
        sum+=nums[i];
        int l=subSeq(nums, i+1,t,sum,arr);
        arr.remove(arr.size()-1);
        sum-=nums[i];
        int r=subSeq(nums, i+1,t,sum,arr);
       // int ans =l+r%(int)mod;
        return l+r%(int)mod;
    }
}
