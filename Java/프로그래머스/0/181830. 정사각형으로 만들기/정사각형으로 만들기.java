public class Solution {
    public int[][] solution(int[][] arr) {
        
        int rowLen = arr.length;
        int colLen = arr[0].length;
        int maxLen = rowLen > colLen ? rowLen : colLen;
        
        if (rowLen != colLen) {
            int[][] newArr = new int[maxLen][maxLen];
            for (int i = 0; i < rowLen; i++) {
                for (int j = 0; j < colLen; j++) {
                    newArr[i][j] = arr[i][j];
                }
            }
            return newArr;
        } else {
            return arr;
        }
    }
}