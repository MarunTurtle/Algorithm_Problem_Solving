// import java.util.*;

// class Solution {
//     public int solution(int[] rank, boolean[] attendance) {
//         // Create a list of students who can attend
//         List<Integer> attendees = new ArrayList<>();
        
//         for (int i = 0; i < rank.length; i++) {
//             if (attendance[i]) {
//                 attendees.add(i);
//             }
//         }
        
//         // Sort the attendees based on their ranks
//         attendees.sort(Comparator.comparingInt(i -> rank[i]));
        
//         // Get the top 3 students
//         int a = attendees.get(0);
//         int b = attendees.get(1);
//         int c = attendees.get(2);
        
//         // Return the result based on the formula
//         return 10000 * a + 100 * b + c;
//     }
// }


import java.util.PriorityQueue;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {

        PriorityQueue<Integer> que = new PriorityQueue<>((a, b) -> rank[a] - rank[b]);
        for (int i = 0; i < attendance.length; i++) {
            if (attendance[i])
                que.add(i);
        }

        return que.poll() * 10000 + que.poll() * 100 + que.poll();
    }
}
