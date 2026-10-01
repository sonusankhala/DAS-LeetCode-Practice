class Solution {
    public int longestConsecutive(int[] nums) {

        Set<Integer> set=new TreeSet<>();
        for(int num:nums){
            set.add(num);
        }
        int max=0;
       // int l=0, r=set.size();
       // int n=0;
        for(int n : set) {
                if(!set.contains(n - 1)) {  // only check for one direction
                    int m = n + 1;
                    while(set.contains(m)) {
                        m++;
                    }
                    max = Math.max(max, m - n);
                }
            }

        return max;
        
    }
}
