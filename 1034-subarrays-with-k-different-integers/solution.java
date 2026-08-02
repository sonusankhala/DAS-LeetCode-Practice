class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {

        return find(nums,k)-find(nums,k-1);
    }
/*
        int count =0;
        int n=nums.length;
        for(int i=0;i<n;i++){
           Set<Integer> set=new HashSet<>();
           // arr.add(nums[i]);
            for(int j=i;j<n;j++){
                set.add(nums[j]);
                if(set.size()==k){
                    count++;
                }

            }
        }
        return count;
        */
        /*
int find(int nums[], int k){
     int r=0,l=0,n=nums.length;
        int count=0;
        Map<Integer,Integer> map=new HashMap<>();

        while(r<n){
            if(map.containsKey(nums[r])){
              map.put(nums[r],map.get(nums[r])+1);
            }else{
                map.put(nums[r],1);
            }
            while(map.size()>k){
                if(map.containsKey(nums[l])){
                  map.put(nums[l],map.get(nums[l])-1);
                 }
                 map.values().removeIf(rm ->rm==0);
                 l++;
            }
            count+=r-l+1;
            r++;
        }
        return count;
        */
        int find(int[] A, int K) {
        int i = 0, res = 0;
        Map<Integer, Integer> count = new HashMap<>();
        for (int j = 0; j < A.length; ++j) {
            if (count.getOrDefault(A[j], 0) == 0) K--;
            count.put(A[j], count.getOrDefault(A[j], 0) + 1);
            while (K < 0) {
                count.put(A[i], count.get(A[i]) - 1);
                if (count.get(A[i]) == 0) K++;
                i++;
            }
            res += j - i + 1;
        }
        return res;

    }
}
