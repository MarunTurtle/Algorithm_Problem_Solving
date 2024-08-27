import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];

        List<Integer> resultList = new ArrayList<>();

        switch (n) {
            case 1:
                // 0번 인덱스부터 b번 인덱스까지
                for (int i = 0; i <= b; i++) {
                    resultList.add(num_list[i]);
                }
                break;

            case 2:
                // a번 인덱스부터 마지막 인덱스까지
                for (int i = a; i < num_list.length; i++) {
                    resultList.add(num_list[i]);
                }
                break;

            case 3:
                // a번 인덱스부터 b번 인덱스까지
                for (int i = a; i <= b; i++) {
                    resultList.add(num_list[i]);
                }
                break;

            case 4:
                // a번 인덱스부터 b번 인덱스까지 c 간격으로
                for (int i = a; i <= b; i += c) {
                    resultList.add(num_list[i]);
                }
                break;

            default:
                throw new IllegalArgumentException("Invalid value of n");
        }

        // ArrayList를 int 배열로 변환하여 반환
        return resultList.stream().mapToInt(i -> i).toArray();
    }
}

// class Solution {
//     public int[] solution(int n, int[] slicer, int[] num_list) {
//         int start = n == 1 ? 0 : slicer[0];
//         int end = n == 2 ? num_list.length - 1 : slicer[1];
//         int step = n == 4 ? slicer[2] : 1;
//         int[] answer = new int[(end - start + step) / step];
//         for (int i = start, j = 0; i <= end; i += step) {
//             answer[j++] = num_list[i];
//         }
//         return answer;
//     }
// }
