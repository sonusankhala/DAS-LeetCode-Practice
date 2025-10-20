class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> arr=new ArrayList<String>();
        generate(arr,n,0,0,"");
        return arr;  
    }

    public void generate(ArrayList<String> arr, int max, int o, int c, String s){
        if(s.length()==2*max){
            arr.add(s);
            return;
        }
        if(o<max){
           generate(arr,max,o+1,c,s+"(");
        }
        if(c<o){
        generate(arr,max,o,c+1,s+")");
        }
    }
}
