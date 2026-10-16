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
        List<String> str=new ArrayList<String>();

        if(digits.length()==0){
            return new ArrayList<String>();
        }else{
            generateStr(str,0,digits,"");

        }
        return str;
        
    }

    void generateStr(List<String> str, int i, String d, String s){

        if(s.length()==d.length()){
            str.add(s);
            return;
        }

        for(char c: map.get(d.charAt(i)).toCharArray()){
            generateStr(str,i+1,d,s+c);
        }
    }
}
