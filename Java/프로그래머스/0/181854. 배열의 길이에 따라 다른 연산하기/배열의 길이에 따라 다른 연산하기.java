public class Solution {
    public int[] solution (int[] arr, int n) {
        
        int len = arr.length;
        int idx = len % 2 == 0 ? 1 : 0;
        
        for (int i = 0; i < len; i++) {
            if (i % 2 == idx) {
                arr[i] += n;
            }
        }
        
        return arr;
    }
}