public class Solution {
    public int[] solution (int[] arr) {
        
        int len = arr.length;
        int target = 1;
        
        while (len > target) {
            target *= 2;
        }
        
        int[] result = new int[target];
        for (int i = 0; i < len ; i++) {
            result[i] = arr[i];
        }
    
        return result;
    }
}