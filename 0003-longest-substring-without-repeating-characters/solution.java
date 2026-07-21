class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxlen=0;

        /*
        if(s.length()==1){
            return 1;
        }
        
       
        for(int i=0;i<s.length();i++){
            //String st="";
            Map<Character,Integer> map=new HashMap<>();
            for(int j=i;j<s.length();j++){
                if(map.containsKey(s.charAt(j))){
                    //maxlen=Math.max(maxlen,j-i);
                    break;
                }else{
                    map.put(s.charAt(j),j);
                }
                maxlen=Math.max(maxlen,map.size());
            }
        }

        */
int l=0,r=0;
int n=s.length();
int [] arr=new int[256];
for(int i=0;i<=255;i++){
    arr[i]=-1;
}
while(r<n){
   // System.out.println(arr[s.charAt(r)]);
    if(arr[s.charAt(r)]!=-1){
        if(arr[s.charAt(r)]>=l){
            l=arr[s.charAt(r)]+1;
        }
    }
    int len=r-l+1;
    maxlen=Math.max(maxlen,len);
    arr[s.charAt(r)]=r;
    r++;
   
}

        return maxlen;
        
    }
}
