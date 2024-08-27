import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner object to read input
        int T = sc.nextInt(); // Read the number of test cases

        // Loop over each test case
        for (int test_case = 1; test_case <= T; test_case++) {
            int N = sc.nextInt(); // Read the length of the hexadecimal string
            int K = sc.nextInt(); // Read the position of the Kth largest number to find
            String hexaString = sc.next(); // Read the hexadecimal string

            int segmentLength = N / 4; // Calculate the length of each segment (since there are 4 sides)
            List<Integer> uniqueNumbers = new ArrayList<>(); // List to store unique numbers

            // Loop to perform rotations and extract numbers
            for (int i = 0; i < segmentLength; i++) {
                // Extract 4 segments from the string in each rotation
                for (int j = 0; j < 4; j++) {
                    // Extract a segment from the string
                    String segment = hexaString.substring(j * segmentLength, (j + 1) * segmentLength);
                    
                    // Convert the hexadecimal segment to an integer (decimal value)
                    int decimalValue = Integer.parseInt(segment, 16);
                    
                    // If the number is not already in the list, add it
                    if (!uniqueNumbers.contains(decimalValue)) {
                        uniqueNumbers.add(decimalValue);
                    }
                }
                // Rotate the string by moving the last character to the front
                hexaString = hexaString.substring(N - 1) + hexaString.substring(0, N - 1);
            }

            // Sort the list of unique numbers in descending order
            Collections.sort(uniqueNumbers, Collections.reverseOrder());
            
            // Get the Kth largest number (K-1 because lists are 0-indexed)
            System.out.println("#" + test_case + " " + uniqueNumbers.get(K - 1));
        }

        sc.close(); // Close the scanner to avoid resource leaks
    }
}
