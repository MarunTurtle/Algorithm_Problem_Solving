import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(int[] arr, int[][] queries) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int[] set : queries) {
            int s = set[0];
            int e = set[1];
            int k = set[2];

            int minVal = Integer.MAX_VALUE;
            boolean found = false;

            for (int i = s; i <= e; i++) {
                if (arr[i] > k && arr[i] < minVal) {
                    minVal = arr[i];
                    found = true;
                }
            }

            if (found) {
                result.add(minVal);
            } else {
                result.add(-1);
            }
        }

        return result;
    }
}


// import java.util.Arrays;

// class Solution {
//     public int[] solution(int[] arr, int[][] queries) {

//         int[] answer = new int[queries.length];
//         Arrays.fill(answer, -1);

//         for (int idx = 0; idx < queries.length; idx++) {
//             int[] query = queries[idx];
//             int s = query[0], e = query[1], k = query[2];

//             for (int i = s; i <= e; i++) {
//                 if (k < arr[i]) {
//                     answer[idx] = answer[idx] == -1 ? arr[i] : Math.min(answer[idx], arr[i]);
//                 }
//             }

//         }

//         return answer;
//     }
// }