class Solution {
    public int solution(int[] date1, int[] date2) {
        for (int i = 0; i < 3; i++) {
            if (date1[i] < date2[i]) {
                return 1;  // date1이 date2보다 이전인 경우
            } else if (date1[i] > date2[i]) {
                return 0;  // date1이 date2보다 이후인 경우
            }
        }
        return 0;  // 날짜가 동일한 경우
    }
}
