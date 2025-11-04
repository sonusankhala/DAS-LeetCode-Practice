class Solution {
    public int[] asteroidCollision(int[] a) {

        Stack<Integer> st=new Stack<Integer>();
        for(int i=0;i<a.length;i++){
            int x=a[i];
            while(!st.empty() && st.peek()>0 && x<0){
                if(st.peek()<Math.abs(x)){
                    st.pop();
                }else if(st.peek()==Math.abs(x)){
                    st.pop();
                    x=0;
                }else {
                    x=0;
                }
            }
            if(x!=0){
              st.push(x);
            }
        }
        int [] arr=new int[st.size()];
        for(int i=st.size()-1;i>=0;i--){
            arr[i]=st.pop();
        }
        return arr;   
    }
}
