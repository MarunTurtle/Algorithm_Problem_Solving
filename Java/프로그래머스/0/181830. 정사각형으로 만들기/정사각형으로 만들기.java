class Solution {
    public int[][] solution (int[][] arr) {
        
        int colsize = arr[0].length;
        int rowsize = arr.length;
        int size = Math.max(colsize, rowsize);       
        int[][] result = new int[size][size];
        
        if (colsize != rowsize) {
            for (int i = 0; i < rowsize; i++) {
                for (int j = 0; j < colsize; j++) {
                    result[i][j] = arr[i][j];
                }
            }
            
            return result;
        } else {
            return arr;
        }
    }   
}