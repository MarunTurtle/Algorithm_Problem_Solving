class Solution {
    public int[] solution(int[] arr, int[] query) {
        int start = 0;
        int end = arr.length;

        // query 배열을 순회하면서 arr 배열을 잘라냄
        for (int i = 0; i < query.length; i++) {
            if (i % 2 == 0) {
                // 짝수 인덱스: query[i] 이후의 요소를 잘라냄
                end = start + query[i] + 1;
            } else {
                // 홀수 인덱스: query[i] 이전의 요소를 잘라냄
                start = start + query[i];
            }
        }

        // 최종 결과를 배열로 반환
        int[] answer = new int[end - start];
        System.arraycopy(arr, start, answer, 0, end - start);
        
        return answer;
    }
}
