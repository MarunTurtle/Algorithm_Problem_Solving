class Solution {
    public int[] solution(int[] num_list) {
        
        int last_idx = num_list.length;
        int last = num_list[last_idx-1];
        int secondLast = num_list[last_idx-2];

        int newNum;
        if (last > secondLast) {
            newNum = last - secondLast;
        } else {
            newNum = last * 2;
        }

        int[] newArr = new int[last_idx + 1];
        System.arraycopy(num_list, 0, newArr, 0, num_list.length);
        newArr[last_idx] = newNum;

        return newArr;
    }
}

// import java.util.ArrayList;

// public class Solution {
//     public int[] solution(int[] num_list) {
//         // Convert the array to an ArrayList
//         ArrayList<Integer> list = new ArrayList<>();
//         for (int num : num_list) {
//             list.add(num);
//         }
        
//         int last = list.get(list.size() - 1);
//         int secondLast = list.get(list.size() - 2);
        
//         if (last > secondLast) {
//             list.add(last - secondLast);
//         } else {
//             list.add(last * 2);
//         }
        
//         // Convert the ArrayList back to an array
//         int[] result = new int[list.size()];
//         for (int i = 0; i < list.size(); i++) {
//             result[i] = list.get(i);
//         }
        
//         return result;
//     }
// }
