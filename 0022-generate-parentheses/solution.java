class Solution {
    public List<String> generateParenthesis(int n) {

         ArrayList<String> arr=new ArrayList<>();
         generate(arr,n,0,0,"");
         return arr;
        
    }

    void generate(ArrayList<String> arr, int n, int a, int b, String s){
        if(s.length()==2*n){
            arr.add(s);
            return;
        }
        if(a<n){
            generate(arr, n, a+1,b,s+"(");
        }
        if(b<a){
             generate(arr, n, a,b+1,s+")");
        }
    }
}
