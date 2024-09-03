// class Solution {
//     public int[] solution(int[] arr, int k) {
//         if (k % 2 == 0) {
//             for (int i = 0; i < arr.length; i++) {
//                 arr[i] += k;
//             }
//         } else {
//             for (int i = 0; i < arr.length; i++) {
//                 arr[i] *= k;
//             }
//         }
//         return arr;
//     }
// }


class Solution {
    public int[] solution(int[] arr, int k) {
        int index = 0;  // Auxiliary index variable
        if (k % 2 == 0) {
            for (int n : arr) {
                arr[index] = n + k;
                index++;
            }
        } else {
            index = 0;  // Resetting the index for the second loop
            for (int n : arr) {
                arr[index] = n * k;
                index++;
            }
        }
        return arr;
    }
}
