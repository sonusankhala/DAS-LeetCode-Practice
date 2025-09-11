class Solution {
    public String frequencySort(String s) {

        Map<Character,Integer> map=new HashMap<>();

        for(int i=0; i<s.length();i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
        }
        List<Map.Entry<Character,Integer>> list= new ArrayList<>(map.entrySet());
        list.sort((e1,e2)->e2.getValue().compareTo(e1.getValue()));
        StringBuilder str=new StringBuilder();
        
        for(Map.Entry<Character,Integer> entry:list){
            for(int i=0;i<entry.getValue();i++){
                 str.append(entry.getKey());
            }   
        }
        return str.toString();
    }
}
