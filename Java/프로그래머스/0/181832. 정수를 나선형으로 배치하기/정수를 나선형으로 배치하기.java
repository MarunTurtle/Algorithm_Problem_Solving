class Solution {
    public int[][] solution (int n) {
        
        int t = n * n;
        int[][] matrix = new int[n][n];
        
        int top = 0, bottom = n-1;
        int left = 0, right = n-1;
        
        int value = 1;
        
        while (value <= t) {
            
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