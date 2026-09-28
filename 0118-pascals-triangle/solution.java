class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> arr=new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            arr.add(generateRows(i));
        }
        
        return arr;
    }

    public static List<Integer> generateRows(int N){
           List<Integer> numbers = new ArrayList<>();
            numbers.add(1); 
            int ans=1;
        
        for(int i=1;i<N;i++){
            ans=ans*(N-i);
            ans=ans/(i);
            numbers.add(ans);
        }

        return numbers;
    }
}
