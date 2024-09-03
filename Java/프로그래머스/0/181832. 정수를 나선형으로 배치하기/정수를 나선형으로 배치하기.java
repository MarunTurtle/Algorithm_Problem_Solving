class Solution {
    public int[][] solution(int n) {
        int t = n * n; // Total number of elements to fill
        int[][] spiral = new int[n][n]; // Create an n x n array
        
        int value = 1; // The first number to fill in the array
        int top = 0, bottom = n - 1;
        int left = 0, right = n - 1;
        
        while (value <= t) {
            // Fill the top row (left -> right)
            for (int i = left; i <= right; i++) {
                spiral[top][i] = value++;
            }
            top++;
            
            // Fill the right column (top -> bottom)
            for (int i = top; i <= bottom; i++) {
                spiral[i][right] = value++;
            }
            right--;
            
            // Fill the bottom row (right -> left)
            for (int i = right; i >= left; i--) {
                spiral[bottom][i] = value++;
            }
            bottom--;
            
            // Fill the left column (bottom -> top)
            for (int i = bottom; i >= top; i--) {
                spiral[i][left] = value++;
            }
            left++;
        }
        
        return spiral; // Return the result
    }
}
