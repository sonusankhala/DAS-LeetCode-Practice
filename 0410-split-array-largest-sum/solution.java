class Solution {
    public int splitArray(int[] nums, int k) {

        int n=nums.length;
        int maxi=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<n;i++){
            maxi=Math.max(maxi,nums[i]);
            sum+=nums[i];
        }

        while(maxi<=sum){
            int mid=(maxi+sum)/2;
            int aa=findArr(nums, mid);
            if(aa<=k){
                sum=mid-1;
            }else{
                maxi=mid+1;
            }
        }
        return maxi;
        
    }

    public static int findArr(int arr[], int mid){
        int c=1, l=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]+l<=mid){
                l+=arr[i];
            }else{
                c++;
                l=arr[i];
            }
        }
        return c;
    }
}
