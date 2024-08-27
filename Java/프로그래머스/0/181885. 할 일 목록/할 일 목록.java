// class Solution {
//     public String[] solution(String[] todo_list, boolean[] finished) {
        
//         int size = 0;
//         for (int i = 0; i < finished.length; i++) {
//             if (finished[i] == false) size++;
//         }
        
//         String[] answer = new String[size];
//         int idx = 0;
        
//         for (int i = 0; i < todo_list.length; i++) {
//             if (finished[i] == false) {
//                 answer[idx++] = todo_list[i];
//             }
//         }
        
//         return answer;
//     }
// }


import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        List<String> resultList = new ArrayList<>();
        
        for(int i = 0; i < finished.length; i++) {
            if(!finished[i]) {
                resultList.add(todo_list[i]);
            }
        }
        
        // Convert the list to an array
        return resultList.toArray(new String[0]);
    }
}
