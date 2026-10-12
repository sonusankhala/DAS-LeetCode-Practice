class Solution {
    public List<String> validStrings(int n) {
        ArrayList<String> arr=new ArrayList<String>();

        generateString(arr,n,"");

        return arr;
        
    }

    void generateString(ArrayList<String> arr, int n, String s){
        if(s.length()==n){
            boolean one=false;
            int l=0;
            int r=0;
            while(l<n){
                if(s.charAt(l)=='1'){
                    r=0;
                    one=true;
                }else{
                    r++;
                    if(r>=2){
                        return;
                    }
                    one=true;
                }
                l++;
            }
            if(one){
                arr.add(s);
            }
            return;

        }
        generateString(arr,n,s+"0");
        generateString(arr,n,s+"1");

    }
}
