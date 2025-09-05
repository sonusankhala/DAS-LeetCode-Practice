class Solution {
    public int shipWithinDays(int[] weights, int days) {

        int ma=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<weights.length;i++){
            ma=Math.max(ma,weights[i]);
            sum+=weights[i];
        }

        while(ma<sum){
            int m=ma+(sum-ma)/2;
            int d=findDays(weights, m);
            if(d<=days){
                sum=m;
            }else{
                ma=m+1;
            }
        }
        return ma;
        
    }

    public int findDays(int []weights, int m){
        int c=1;
        int s=0;
        for(int i=0;i<weights.length;i++){
           if(s+weights[i]>m){
            c+=1;
            s=0;
           }
            s+=weights[i];
           
        }
        return c;
    }
}
