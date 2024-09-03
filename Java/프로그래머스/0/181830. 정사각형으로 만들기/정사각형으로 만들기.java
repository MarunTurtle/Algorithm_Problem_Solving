class Solution {
    public int[][] solution(int[][] arr) {
        int numRows = arr.length; // 행의 수
        int numCols = arr[0].length; // 열의 수

        if (numRows > numCols) {
            // 행의 수가 더 많을 때, 각 행의 끝에 0을 추가
            int[][] result = new int[numRows][numRows]; // 새로운 배열 크기는 numRows x numRows
            for (int i = 0; i < numRows; i++) {
                for (int j = 0; j < numCols; j++) {
                    result[i][j] = arr[i][j]; // 기존 값을 복사
                }
                for (int j = numCols; j < numRows; j++) {
                    result[i][j] = 0; // 부족한 부분을 0으로 채움
                }
            }
            return result;
        } else if (numCols > numRows) {
            // 열의 수가 더 많을 때, 각 열의 끝에 0을 추가
            int[][] result = new int[numCols][numCols]; // 새로운 배열 크기는 numCols x numCols
            for (int i = 0; i < numRows; i++) {
                for (int j = 0; j < numCols; j++) {
                    result[i][j] = arr[i][j]; // 기존 값을 복사
                }
            }
            for (int i = numRows; i < numCols; i++) {
                for (int j = 0; j < numCols; j++) {
                    result[i][j] = 0; // 부족한 부분을 0으로 채움
                }
            }
            return result;
        } else {
            // 행과 열의 수가 같으면 원래 배열 반환
            return arr;
        }
    }
}
