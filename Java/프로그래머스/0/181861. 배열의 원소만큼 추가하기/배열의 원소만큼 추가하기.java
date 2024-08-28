class Solution {
    public int[] solution(int[] arr) {
        
        // Calculate the size of the result array
        int size = 0;
        for (int i = 0; i < arr.length; i++) {
            size += arr[i];
        }
        
        // Declare the result array with the calculated size
        int[] result = new int[size];
        
        // Fill the result array
        int index = 0;  // Current position in the result array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i]; j++) {
                result[index++] = arr[i];
            }
        }
        
        return result;
    }
}
