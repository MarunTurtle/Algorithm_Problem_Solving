import java.util.Scanner;

class Solution {
    // Recursive function to calculate N^M
    public static int power(int N, int M) {
        if (M == 0) {
            return 1; // Base case: N^0 = 1
        } else {
            return N * power(N, M - 1); // Recursive case: N^M = N * N^(M-1)
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = 10; // Number of test cases

        for (int i = 1; i <= T; i++) {
            int test_case = sc.nextInt(); // Input test_case
            int N = sc.nextInt(); // Input N
            int M = sc.nextInt(); // Input M

            int result = power(N, M); // Calculate N^M using the power function

            // Output the result in the format "#test_case_number result"
            System.out.println("#" + test_case + " " + result);
        }
        
        sc.close();
    }
}
