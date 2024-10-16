import java.util.*;

public class Solution {
    public int[] solution(int[] arr, int[] delete) {
        Deque<Integer> arrQue = new ArrayDeque<>();
        for (int num : arr) {
            arrQue.offer(num);
        }

        // 삭제할 값들을 저장하는 Set을 사용 (중복 제거와 빠른 탐색)
        Set<Integer> deleteSet = new HashSet<>();
        for (int num : delete) {
            deleteSet.add(num);
        }

        int originalSize = arrQue.size();
        for (int i = 0; i < originalSize; i++) {
            int temp = arrQue.poll();
            if (!deleteSet.contains(temp)) {
                arrQue.offer(temp);
            }
        }

        return arrQue.stream().mapToInt(i -> i).toArray();
    }
}
