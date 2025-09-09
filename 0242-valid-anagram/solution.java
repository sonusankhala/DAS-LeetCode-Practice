class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }

        int n=s.length();

        Map<Character, Integer> maps=new HashMap<>();
        Map<Character, Integer> mapt=new HashMap<>();
        for(int i=0;i<n;i++){
            if(!maps.containsKey(s.charAt(i))){
                maps.put(s.charAt(i),1);
            }else{
                maps.put(s.charAt(i),maps.get(s.charAt(i))+1);
            }
              if(!mapt.containsKey(t.charAt(i))){
                mapt.put(t.charAt(i),1);
            }else{
                mapt.put(t.charAt(i),mapt.get(t.charAt(i))+1);
            }
            
        }
return maps.equals(mapt);

        
    }
}
