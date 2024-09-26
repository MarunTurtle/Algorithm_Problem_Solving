public class Solution {
    public int solution(int[] arr) {
        int unchanged; 
        int count = 0; 
        
        while (true) {
            unchanged = 0; 
            
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 50 && arr[i] % 2 == 0) {
                    arr[i] /= 2;
                } else if (arr[i] < 50 && arr[i] % 2 == 1) {
                    arr[i] = arr[i] * 2 + 1;
                } else {
                    unchanged++; 
                }
            }
            
            count++; 
            
            if (unchanged == arr.length) {
                break;
            }
        }
        
        return count - 1; 
    }
}
