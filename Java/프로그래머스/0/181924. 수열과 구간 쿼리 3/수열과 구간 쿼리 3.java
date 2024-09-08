// class Solution {
//     public int[] solution(int[] arr, int[][] queries) {
//         // Declare temporary int value for swapping
//         int temp;
//         for (int[] xy : queries) {
//             // swap the selected values
//             temp = arr[xy[0]];
//             arr[xy[0]] = arr[xy[1]];
//             arr[xy[1]] = temp; 
//         }
//         return arr;
//     }
// }

class Solution {
    public int[] solution (int[] arr, int[][] queries) {
        
        for (int i = 0; i < queries.length; i++) {
            
            int n = queries[i][0];
            int m = queries[i][1];
            
            int temp = 0;
            temp = arr[n];
            arr[n] = arr[m];
            arr[m] = temp;
            
        }
        
        return arr;
        
    }
}