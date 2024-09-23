import java.util.*;

public class Solution {
    public int solution(int[] mats, String[][] park) {
        int rowLen = park.length;
        int colLen = park[0].length;
        int maxSize = -1;

        // 큰 크기의 돗자리부터 확인하기 위해 내림차순으로 정렬
        Arrays.sort(mats);
        for (int i = mats.length - 1; i >= 0; i--) {
            int size = mats[i];
            for (int row = 0; row <= rowLen - size; row++) {
                for (int col = 0; col <= colLen - size; col++) {
                    if (canPlaceMat(size, row, col, park)) {
                        // 가능한 돗자리 크기를 찾으면 업데이트
                        maxSize = size;
                        return maxSize; // 가장 큰 돗자리를 찾았으므로 바로 리턴
                    }
                }
            }
        }
        return maxSize; // 아무것도 깔 수 없다면 -1 리턴
    }

    // 주어진 위치에서 size 크기의 돗자리를 깔 수 있는지 확인하는 메서드
    public boolean canPlaceMat(int size, int startRow, int startCol, String[][] park) {
        for (int i = startRow; i < startRow + size; i++) {
            for (int j = startCol; j < startCol + size; j++) {
                if (!park[i][j].equals("-1")) {
                    // 빈 공간이 아니면 false 반환
                    return false;
                }
            }
        }
        // 모두 빈 공간이라면 true 반환
        return true;
    }
}
