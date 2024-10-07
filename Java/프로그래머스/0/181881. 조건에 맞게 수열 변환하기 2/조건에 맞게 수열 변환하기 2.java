public class Solution {
    public int solution(int[] arr) {
        
        boolean isDone = false;
        int count = 0;
        int len = arr.length;
        
        while (!isDone) {
            int round = 0;
            for (int i = 0; i < len; i++) {
                if (arr[i] >= 50 && arr[i] % 2 == 0) {
                    arr[i] /= 2;   
                } else if (arr[i] < 50 && arr[i] % 2 == 1) {
                    arr[i] = (arr[i] * 2) + 1;
                } else {
                    round++;
                }
            }
            if (round == len) isDone = true;
            count++;
        }
        
        return count - 1;
    }
}