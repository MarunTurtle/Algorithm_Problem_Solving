class Solution {
    public int solution(int[] num_list) {
        
        // Initialize product and sum
        int product = 1;
        int sum = 0;

        // multiply and add all numbers
        for (int n : num_list) {
            product *= n;
            sum += n;
        }

        // compare the product and sum^2
        return product < Math.pow(sum, 2) ? 1 : 0;
    }
}

// import java.util.*;

// class Solution {
//     public int solution(int[] num_list) {
//         int sum = Arrays.stream(num_list).reduce(Integer::sum).getAsInt();
//         int product = Arrays.stream(num_list).reduce((i,j)->i*j).getAsInt();
//         return product < sum*sum ? 1 : 0;
//     }
// }