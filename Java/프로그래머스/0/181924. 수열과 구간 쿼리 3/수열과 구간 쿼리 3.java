class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        // Declare temporary int value for swapping
        int temp;
        for (int[] xy : queries) {
            // swap the selected values
            temp = arr[xy[0]];
            arr[xy[0]] = arr[xy[1]];
            arr[xy[1]] = temp; 
        }
        return arr;
    }
}