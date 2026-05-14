class Solution {
    Map<Character,String> map=new HashMap<>();
    {
    map.put('2',"abc");
    map.put('3',"def");
    map.put('4',"ghi");
    map.put('5',"jkl");
    map.put('6',"mno");
    map.put('7',"pqrs");
    map.put('8',"tuv");
    map.put('9',"wxyz");
    }
   
    public List<String> letterCombinations(String digits) {
        List<String> ans= new ArrayList<>();
        int n=digits.length();
        if(n==0){
          return ans;
        }else{
          comb(digits, 0, ans,"");
        }
        
        return ans;
    }

    public void comb(String s, int i, List<String> ans, String c){
        if(s.length()==c.length()){
            ans.add(c);
            return;
        }
        for(char ch: map.get(s.charAt(i)).toCharArray()){
            comb(s,i+1,ans,c+ch);
        }
    }
}
