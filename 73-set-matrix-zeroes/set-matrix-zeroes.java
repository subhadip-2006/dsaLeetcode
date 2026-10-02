class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    setRow(i,matrix,n);
                    setCol(j,matrix,m);
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==-999999) matrix[i][j]=0;
            }
        }
    }
    public void setRow(int i, int[][] matrix, int n){
        for(int j=0;j<n;j++){
            if(matrix[i][j]!=0) matrix[i][j]=-999999;
        }
    }
    public void setCol(int j, int[][] matrix, int m){
        for(int i=0;i<m;i++){
            if(matrix[i][j]!=0) matrix[i][j]=-999999;
        }
    }
}