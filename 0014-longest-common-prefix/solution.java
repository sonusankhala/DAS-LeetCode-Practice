class Solution {
    public String longestCommonPrefix(String[] strs) {
/*
        if(strs.length<=0){
            return "";
        } 
         if(strs.length==1){
            return strs[0];
        } 

        int c=Integer.MAX_VALUE;
       String st="";
        for(int i=0;i<strs.length;i++){
        c=Math.min(c,strs[i].length()); 
        }
boolean x=true;
         for(int i=0;i<c;i++){

            char ch=strs[0].charAt(i);
            for(int j=1;j<strs.length;j++){
                if(strs[j].charAt(i)!=ch){
                    x=false;
                }
            }
            if(x==true){
            st+=ch;
            }
           
        }
        return st;
    }
    */

    String pr=strs[0];
    for(int i=1;i<strs.length;i++){
        while (!strs[i].startsWith(pr)){
            pr=pr.substring(0,pr.length()-1);
            if(pr.length()==0){
                return "";
            }
        }
    }
    return pr;
}
}
