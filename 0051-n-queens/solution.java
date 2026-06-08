class Solution {
    public List<List<String>> solveNQueens(int n) {

    List<List<String>> ans=new ArrayList<>();
    char [][] board=new char[n][n];

    for(int i=0;i<n;i++){
        Arrays.fill(board[i],'.');
    }
    boolean [] left=new boolean[n];
    boolean [] dig1=new boolean[2*n-1];
    boolean [] dig2=new boolean[2*n-1];

    solve(0,n,board,left,dig1,dig2,ans);
    return ans;
        
    }

    public void solve(int row, int n, char [][] board, boolean [] left,boolean [] dig1, boolean [] dig2, List<List<String>> ans){
        if(row==n){
            List<String> str=new ArrayList<>();
            for(int i=0;i<n;i++){
                str.add(new String(board[i]));
            }
            ans.add(str);
            return;
        }
        for(int c=0;c<n;c++){
            int d1=row-c+n-1;
            int d2=row+c;

            if(!left[c] && !dig1[d1] && !dig2[d2]){
                left[c]=dig1[d1]=dig2[d2]=true;
                board[row][c]='Q';
                solve(row+1,n,board,left,dig1,dig2,ans);
                board[row][c]='.';
                left[c]=dig1[d1]=dig2[d2]=false;
            }
        }
    }
}
