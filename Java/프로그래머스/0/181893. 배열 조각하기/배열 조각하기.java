class Solution {
    public int[] solution(int[] arr, int[] query) {
        int s = 0;
        int e = arr.length;

        for (int i = 0; i < query.length; i++) {
            if (i % 2 == 0) {
                e = s + query[i] + 1;
            } else {
                s += query[i];
            }
        }

        int[] answer = new int[e - s];
        System.arraycopy(arr, s, answer, 0, e - s);
        
        return answer;
    }
}
