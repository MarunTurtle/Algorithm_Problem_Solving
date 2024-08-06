class Solution {
    public int solution(int[] num_list) {

        String EvenString = "";
        String OddString = "";

        for (int n : num_list) {
            if (n % 2 == 0) {
                EvenString += "" + n;
            } else {
                OddString += "" + n;
            }
        }

        return Integer.valueOf(OddString) + Integer.valueOf(EvenString);

    }
}


// class Solution {
//     public int solution(int[] num_list) {
//         int answer = 0;

//         int even = 0;
//         int odd = 0;

//         for(int num : num_list) {
//             if(num % 2 == 0) {
//                 even *= 10;
//                 even += num;
//             } else {
//                 odd *= 10;
//                 odd += num;
//             }
//         }
//         answer = even + odd;

//         return answer;
//     }
// }