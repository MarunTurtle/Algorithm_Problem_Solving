import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        int length = arr.length;
        
        // Check if the length is already a power of 2
        int power = 1;
        while (power < length) {
            power *= 2;
        }
        
        // If length is already a power of 2, return arr as is
        if (power == length) {
            return arr;
        }
        
        // Otherwise, create a new array of size `power` and copy arr into it
        int[] result = new int[power];
        
        for (int i = 0; i < length; i++) {
            result[i] = arr[i];
        }
        
        // The remaining elements of the array are initialized to 0 by default in Java
        
        return result;
    }
}
