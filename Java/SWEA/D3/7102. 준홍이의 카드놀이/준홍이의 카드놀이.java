import java.util.Scanner;
import java.io.FileInputStream;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public static void main(String args[]) throws Exception {
        // System.setIn(new FileInputStream("res/input.txt"));
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int N = sc.nextInt(); // Number of cards in the first set
            int M = sc.nextInt(); // Number of cards in the second set

            int[] sumCounts = new int[N + M + 1]; // Array to store the counts of each possible sum

            // Calculate the frequency of each sum
            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= M; j++) {
                    sumCounts[i + j]++;
                }
            }

            // Initialize the queue to store the sums with the highest frequency
            Queue<Integer> result = new LinkedList<>();
            int currentMaxCount = 0;

            for (int sum = 2; sum <= N + M; sum++) {
                if (sumCounts[sum] > currentMaxCount) {
                    result.clear();
                    result.offer(sum);
                    currentMaxCount = sumCounts[sum];
                } else if (sumCounts[sum] == currentMaxCount) {
                    result.offer(sum);
                }
            }

            // Print the result
            System.out.print("#" + test_case);
            while (!result.isEmpty()) {
                System.out.print(" " + result.poll());
            }
            System.out.println();
        }

        sc.close();
    }
}