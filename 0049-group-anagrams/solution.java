class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> arr=new ArrayList<>();
        Map<String, List<String>> map=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char[] sc=strs[i].toCharArray();
            Arrays.sort(sc);
            String s=String.valueOf(sc);

            map.putIfAbsent(s,new ArrayList<>());
            map.get(s).add(strs[i]);
        }

        for(List<String> list:map.values()){
            arr.add(list);
        }

        return arr;
        
    }
}
