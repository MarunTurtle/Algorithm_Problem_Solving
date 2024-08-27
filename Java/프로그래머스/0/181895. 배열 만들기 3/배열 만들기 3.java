
class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        // 두 구간의 길이를 합산하여 최종 배열의 크기를 계산
        int size = (intervals[0][1] - intervals[0][0] + 1) + (intervals[1][1] - intervals[1][0] + 1);
        int[] answer = new int[size];
        
        int index = 0;
        // 첫 번째 구간
        for (int j = intervals[0][0]; j <= intervals[0][1]; j++) {
            answer[index++] = arr[j];
        }
        // 두 번째 구간
        for (int j = intervals[1][0]; j <= intervals[1][1]; j++) {
            answer[index++] = arr[j];
        }
        
        return answer;
    }
}


// import java.util.ArrayList;
// import java.util.List;

// class Solution {
//     public int[] solution(int[] arr, int[][] intervals) {
        
//         List<Integer> answer = new ArrayList<>();
        
//         for (int i = 0; i < 2; i++) {
//             for (int j = intervals[i][0]; j <= intervals[i][1]; j++) {
//                 answer.add(arr[j]);
//             }
//         }
        
//         return answer.stream().mapToInt(i -> i).toArray();
//     }
// }