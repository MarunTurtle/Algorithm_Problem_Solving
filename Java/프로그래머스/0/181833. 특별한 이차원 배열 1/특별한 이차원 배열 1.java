import java.util.*;

public class Solution {
    public int[][] solution (int n) {
        
        int[][] result = new int[n][n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = (i == j) ? 1 : 0;
            }
        }
        
        return result;
    }
}