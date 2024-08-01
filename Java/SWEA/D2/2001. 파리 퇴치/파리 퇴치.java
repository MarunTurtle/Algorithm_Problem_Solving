import java.util.Scanner;

public class Solution {
    public static int result = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get the number of test cases
        int round = sc.nextInt();

        // For loop through each test case
        for (int i = 1; i <= round; i++) {
            // Reset result for each test case
            result = 0;

            // Get the size of the matrix and the size of the target sub-matrix
            int size = sc.nextInt();
            int target = sc.nextInt();

            // Run maxFly()
            result = maxFly(sc, size, target, result);

            // Print the result for the current test case
            System.out.printf("#%d %d\n", i, result);
        }

        sc.close();
    }

    private static int maxFly(Scanner sc, int size, int target, int result) {
        // Declare size*size matrix
        int[][] matrix = new int[size][size];

        // Initialize the matrix
        for (int j = 0; j < size; j++) {
            for (int k = 0; k < size; k++) {
                matrix[j][k] = sc.nextInt();
            }
        }

        // Double loop to calculate the sum of flies in each sub-matrix
        for (int c = 0; c <= size - target; c++) {
            for (int r = 0; r <= size - target; r++) {
                int nresult = 0;
                for (int l = 0; l < target; l++) {
                    for (int m = 0; m < target; m++) {
                        nresult += matrix[c + l][r + m];
                    }
                }

                // Compare nResult vs result and update
                if (nresult > result) {
                    result = nresult;
                }
            }
        }

        return result;
    }
}
