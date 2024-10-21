public class Solution {
    public int[][] solution (int n) {
        
        int[][] matrix = new int[n][n];
        
        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = n - 1;
        
        int value = 1;
        
        while (value <= n*n) {
             // top
            for (int i = left; i <= right; i++) {
                matrix[top][i] = value++; 
            }
            top++;

            // right
            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = value++;
            }
            right--;

            // bottom
            for (int i = right; i >= left; i--) {
                matrix[bottom][i] = value++;
            }
            bottom--;

            // left
            for (int i = bottom; i >= top; i--) {
                matrix[i][left] = value++;
            }
            left++;
        }
        
        return matrix;
    }
}