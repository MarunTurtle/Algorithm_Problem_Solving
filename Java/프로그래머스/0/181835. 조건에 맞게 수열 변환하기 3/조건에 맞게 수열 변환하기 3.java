class Solution {
    public int[] solution(int[] arr, int k) {
               
        int len = arr.length;
        
        for (int i = 0; i < len; i++) {
            if (k % 2 == 0) {
                arr[i] += k;   
            } else {
                arr[i] *= k;
            }
        }
        
        return arr;
    }
}