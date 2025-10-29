class Solution {
     public int[] nextGreaterElements(int[] nums) {
        
        /*
        int n=nums.length;
        if(n<=1){
            return new int[]{-1};
        }
        int [] arr=new int[n];
        for(int i=0;i<n; i++){

            for(int j=i+1;j<=i+n-1;j++){
                int x=j%n;
                if(nums[x]>nums[i]){
                    arr[i]=nums[x];
                    break;
                }else {
                    arr[i]=-1;
                }
            }     
        }
        return arr; 
        */

       int n=nums.length;
       int arr[]=new int[n];
       Stack<Integer> st=new Stack<>();
       for( int i=(2*n)-1; i>=0 ;i--){

           while(!st.empty() && st.peek()<=nums[i%n]){
            st.pop();
            }
            if(i<n && !st.empty()){
                 arr[i]=st.peek();
            }else{
                arr[i%n]=-1;
            }
            st.push(nums[i%n]);
       }
       return arr;
    }
}
