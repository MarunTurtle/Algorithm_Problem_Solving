class Solution {
    public int solution(int[] arr, int idx) {
        
        // Iterate through arry from idx to the end
        for (int i = idx; i < arr.length; i++) {
            // Check if the value of the item is 1
            if (arr[i] == 1) {
                return i;
            }            
        }
        // If not found, return -1
        return -1;
    }
}