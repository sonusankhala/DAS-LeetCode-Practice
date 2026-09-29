class Solution {
    public void rotate(int[][] matrix) {


        int n=matrix.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp= matrix[i][j];
                 matrix[i][j]=matrix[j][i];
                 matrix[j][i]=temp;
            }
        }
        for(int i=0;i<n;i++){
            reverse(matrix[i]);
        }
        //return matrix;
        
    }
    public static void reverse(int [] matrix){
        int l=0, r=matrix.length-1;
        while(l<r){
            int temp=matrix[l];
            matrix[l]=matrix[r];
            matrix[r]=temp;
            l++;
            r--;
        }
    }
}
