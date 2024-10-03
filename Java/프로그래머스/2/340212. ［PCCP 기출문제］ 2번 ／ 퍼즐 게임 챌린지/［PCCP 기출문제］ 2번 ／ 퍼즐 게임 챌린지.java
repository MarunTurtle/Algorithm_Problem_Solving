class Solution {
    public int solution(int[] diffs, int[] times, long limit) {
        // 이분 탐색을 위한 diffs 최대값 찾기
        int max = 1;
        for (int i = 1; i < diffs.length; i++)
            max = Math.max(max, diffs[i]);
        
        // 이분 탐색 범위 설정
        int left = 1;
        int right = max;
        
        // 이분 탐색 실행
        while (left <= right) {
            int mid = (left + right) / 2;
            
            // 현재 mid 값에서 limit 내에 가능한지 확인
            if (isLevelAvailable(diffs, times, limit, mid)) {
                right = mid - 1;  // 가능하면 더 작은 범위 탐색
            } else {
                left = mid + 1;   // 불가능하면 더 큰 범위 탐색
            }
        }
        
        // 최종적으로 가능한 최소 level 반환
        return left;
    }
    
    // 특정 level에서 limit 내에 가능한지 검사
    static boolean isLevelAvailable(int[] diffs, int[] times, long limit, int level) {
        long sum = times[0]; // 첫 번째 시간 더함
        for (int i = 1; i < diffs.length; i++) {
            if (diffs[i] <= level) { // 숙련도가 level보다 크거나 같으면
                sum += times[i];
            } else { // 숙련도가 level보다 낮으면 추가 시간 필요
                sum += (times[i-1] + times[i]) * (diffs[i] - level) + times[i];
            }
            
            if (sum > limit) return false; // 제한 시간을 넘으면 불가능
        }
        return true; // 제한 시간 내에 가능하면 true
    }
}
