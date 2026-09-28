class Solution {
    public List<Integer> getRow(int rowIndex) {

        List<Integer> arr=new ArrayList<>();
        arr.add(1);
        long res=1;
        for(int i=1;i<rowIndex+1;i++ ){
            res=res*(rowIndex+1-i);
            res=res/i;
            arr.add((int)res);
        }
        return arr;
        
    }
}
