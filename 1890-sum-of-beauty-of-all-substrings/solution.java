class Solution {
    public int beautySum(String s) {

        int n=s.length();
        int count=0;
        
     //   String str=s.substring(0,maxlen);
        for(int i=0;i<n;i++){
            int [] fr=new int[26];
            for(int j=i;j<n;j++){
                fr[s.charAt(j)-'a']++;

                 int min=Integer.MAX_VALUE;
                 int max=Integer.MIN_VALUE;

                 for(int k=0;k<26;k++){
                    int d=fr[k];
                    if(d>0){
                        min=Math.min(min,d);
                        max=Math.max(max,d);
                    }
                 }
                 count+=max-min;
            }
        }

        return count;


        
    }

    int isBeauty(String s){
        Map<Character,Integer> map=new HashMap<>();
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
            }else{
                map.put(s.charAt(i),1);
            }
        }
        for(int i:map.values()){
            min=Math.min(min,i);
            max=Math.max(max,i);
        }

        return max-min;
       // return true;
    }
}
