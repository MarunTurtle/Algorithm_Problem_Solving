import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // Number of test cases

        for (int t = 1; t < T + 1; t++) {
            int N = sc.nextInt(); // Number of ingredients
            int L = sc.nextInt(); // Calorie limit

            int[] scores = new int[N];
            int[] calories = new int[N];

            for (int i = 0; i < N; i++) {
                scores[i] = sc.nextInt(); // Taste score
                calories[i] = sc.nextInt(); // Calorie count
            }

            int[] dp = new int[L + 1];

            // Dynamic Programming approach to solve knapsack problem
            for (int i = 0; i < N; i++) {
                for (int j = L; j >= calories[i]; j--) {
                    dp[j] = Math.max(dp[j], dp[j - calories[i]] + scores[i]);
                }
            }

            // The answer for the current test case
            System.out.println("#" + t + " " + dp[L]);
        }

        sc.close();
    }
}
