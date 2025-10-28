class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int [] arr=new int[nums1.length];

        Map<Integer, Integer> map=new LinkedHashMap<>();
        for( int i=0;i<nums2.length;i++){
            map.put(nums2[i],i);
        }
        for(int j=0;j<nums1.length;j++){
            int a=map.get(nums1[j]);
            System.out.println(a);
            if(a<nums2.length-1){
                boolean flag=false;
                for(int k=a+1;k<nums2.length;k++){
                    if(nums2[k]>nums2[a]){
                        arr[j]=nums2[k];
                        flag=true;
                        break;
                    }
                }
                if(!flag){
                    arr[j]=-1;
                }
            }else{
                arr[j]=-1;
            }
        }

        return arr;
    }
}
