public class Solution {
    public int[] solution (int[] arr) {
        int len = arr.length;
        int target = 1;
        
        while (len > target) {
            target *= 2;
        }
        
        int[] result = new int[target];
        int i = 0;
        for (int num : arr) {
            result[i++] = num;
        }
        
        return result;        
    }
}