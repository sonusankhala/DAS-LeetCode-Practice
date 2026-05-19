class Solution {
    public boolean exist(char[][] board, String word) {
        int n=board.length;
        int m=board[0].length;
        boolean ans=false;
        boolean [][] visited=new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j]==word.charAt(0)){
                    ans=Solve(board, word, visited, i, j, 0);
                    if(ans){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    boolean Solve(char [][] arr,String word, boolean [][] visited, int i, int j, int k){
        if(k==word.length()){
            return true;
        }
        if(i<0 || i>= arr.length || j<0 || j>=arr[0].length 
        || visited[i][j] || arr[i][j]!=word.charAt(k))
        {
            return false;
        }
        visited[i][j]=true;

        if(Solve(arr, word, visited, i+1,j,k+1)
        || Solve(arr, word, visited, i-1,j,k+1)
        || Solve(arr, word, visited, i, j+1, k+1)
        || Solve(arr, word, visited, i, j-1, k+1))
        {
            return true;
        }
        visited[i][j]=false;
        return false;
    }
}
