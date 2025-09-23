class Solution {
    static void arrayreverse(int [] matrix){
        int i = 0, j= matrix.length-1;
        while(i<j){
            int temp = matrix[i];
            matrix[i] = matrix[j];
            matrix[j] = temp;
            i++;
            j--;
        }
    }
    static void transpose(int [][] matrix){
        for(int i = 0; i<matrix.length; i++){
            for(int j = i; j<matrix[i].length; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
    public void rotate(int[][] matrix) {
        transpose(matrix);
        for (int i = 0; i<matrix.length; i++){
            arrayreverse(matrix[i]);
        }
        
    }
}