class Solution {
    public boolean rotateString(String s, String g) {
      //boolean ans=false;
      int n=s.length();
        if (s.length()!=g.length()){
            return false;
        }
        /*
        String o=s+s;
        return o.contains(g);
        */

        for(int i=0;i<n;i++){
            String r=(s.substring(n-i)+s.substring(0,n-i));
            if(r.equals(g)){
                return true;
            }
        }
    
        return false;

    }
      
}
