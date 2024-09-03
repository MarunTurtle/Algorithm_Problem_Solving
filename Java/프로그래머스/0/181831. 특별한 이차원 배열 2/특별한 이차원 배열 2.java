class Solution {
    public int solution(int[][] arr) {
        int result = 1;
        for (int i = 0; i < arr.length/2 + 1; i++) {
            for (int j = 0; j < arr.length/2 + 1; j++) {
                if (arr[i][j] != arr[j][i]) {
                    result = 0;
                    break;
                } 
            }
        }
        return result;
    }
}