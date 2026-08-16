class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b)-> Integer.compare(a[0],b[0]));

        List<int[]> merge=new ArrayList<>();
        int[] pre=intervals[0];
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]<=pre[1]){
                pre[1]=Math.max(intervals[i][1],pre[1]);
            }else{
                merge.add(pre);
                pre=intervals[i];
            }
        }

        merge.add(pre);
        return merge.toArray(new int[merge.size()][]);
        
    }
}
