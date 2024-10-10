import java.util.Arrays;

class Solution {
    public int solution(int[][] targets) {
        // 1. 미사일의 끝 지점(e)을 기준으로 정렬
        Arrays.sort(targets, (a, b) -> Integer.compare(a[1], b[1]));

        // 2. 요격 미사일 개수 카운트 및 마지막 요격 지점 추적
        int count = 0;
        int lastShot = Integer.MIN_VALUE;

        // 3. 각 미사일 범위를 순회하며 처리
        for (int[] target : targets) {
            int start = target[0];
            int end = target[1];

            // 현재 미사일의 시작점이 마지막 요격 지점보다 크거나 같으면 새로 요격
            if (start >= lastShot) {
                lastShot = end;
                count++;
            }
        }

        // 4. 최종 요격 미사일 개수 반환
        return count;
    }
}
