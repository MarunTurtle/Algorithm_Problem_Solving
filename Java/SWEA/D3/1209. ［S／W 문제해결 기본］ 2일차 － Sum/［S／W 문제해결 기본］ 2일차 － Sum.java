import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=10;

        for (int test_case = 1; test_case <= T; test_case++) {
            // Get current round
            int round = sc.nextInt();

            // Get int for 100 x 100 matrix
            int[][] matrix = new int[100][100];

            for (int r = 0; r < 100; r++) {
                for (int c = 0; c < 100; c++) {
                    matrix[r][c] = sc.nextInt();
                }
            }

            // Declare sums
            int maxSum = 0;
            int nSum;

            // Iterate row
            for (int r = 0; r < 100; r++) {
                nSum = 0; // Reset nSum for each row
                for (int c = 0; c < 100; c++) {
                    nSum += matrix[r][c];
                }
                if (nSum > maxSum) {
                    maxSum = nSum;
                }
            }

            // Iterate column
            for (int c = 0; c < 100; c++) {
                nSum = 0; // Reset nSum for each column
                for (int r = 0; r < 100; r++) {
                    nSum += matrix[r][c];
                }
                if (nSum > maxSum) {
                    maxSum = nSum;
                }
            }

            // Iterate Left to Right diagonal 
            nSum = 0; // Reset nSum for diagonal
            for (int r = 0, c = 0; r < 100 && c < 100; r++, c++) {
                nSum += matrix[r][c];
            }
            if (nSum > maxSum) {
                maxSum = nSum;
            }

            // Iterate Right to Left diagonal 
            nSum = 0; // Reset nSum for diagonal
            for (int r = 0, c = 99; r < 100 && c >= 0; r++, c--) {
                nSum += matrix[r][c];
            }
            if (nSum > maxSum) {
                maxSum = nSum;
            }

            // Print result
            System.out.printf("#%d %d%n", round, maxSum);
        }
    }
}