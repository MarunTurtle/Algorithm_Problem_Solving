// class Solution {
//     public int[] solution(int[] arr, int[][] queries) {
//         for (int[] query : queries) {
//             int s = query[0];
//             int e = query[1];
//             int k = query[2];

//             for (int i = s; i <= e; i++) {
//                 if (i % k == 0) {
//                     arr[i] += 1;
//                 }
//             }
//         }
//         int[] answer = arr;
//         return answer;
//     }
// }



class Solution {
    public int[] solution (int[] arr, int[][] queries) {
        
        int t = queries.length;
        
        for (int i = 0; i < t; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];
            
            for (int j = s; j <= e; j++) {
                if (j % k == 0) {
                    arr[j] += 1;
                }
            }
        }
        
        return arr;
    }
}