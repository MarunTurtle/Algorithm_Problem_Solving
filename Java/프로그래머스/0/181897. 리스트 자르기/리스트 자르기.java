public class Solution {
    public int[] solution (int n, int[] slicer, int[] num_list) {
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];
        int len = num_list.length - 1;
        
        int start = n == 1 ? 0 : a;
        int end = n == 2 ? len : b;
        int steps = n == 4 ? c : 1;
        
        int[] result = new int[(end - start + steps) / steps];
        int idx = 0;
            
        for (int i = start; i <= end; i += steps) {
            result[idx++] = num_list[i];
        }
        
        return result;        
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
