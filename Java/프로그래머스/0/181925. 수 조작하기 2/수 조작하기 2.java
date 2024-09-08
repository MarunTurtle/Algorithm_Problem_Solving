// class Solution {
//     public String solution(int[] numLog) {
        
//         // Use StringBuilder instead of String as String is immutalbe whcih means it creates new string every time in concatenates. 
//         StringBuilder answer  = new StringBuilder();

//         for (int i = 0; i < numLog.length - 1; i++) {
//             switch (numLog[i+1] - numLog[i]) {
//                 case 1 -> answer.append('w');
//                 case 10 -> answer.append('d');
//                 case -1 -> answer.append('s');
//                 case -10 -> answer.append('a');
//                 default -> {
//                 }
//             }
//         }
//         // Change StringBuilder to String.
//         return answer.toString();
//     }
// }

class Solution {
    public String solution (int[] numLog) {
        
        StringBuilder sb = new StringBuilder();
        
        int len = numLog.length;
        
        for (int i = 0; i < len - 1; i++) {
            switch (numLog[i+1] - numLog[i]) {
                    case 1 -> sb.append('w');
                    case 10 -> sb.append('d');
                    case -1 -> sb.append('s');
                    case -10 -> sb.append('a');
                    default -> {}
            }
        }
        
        return sb.toString();
    }
}










