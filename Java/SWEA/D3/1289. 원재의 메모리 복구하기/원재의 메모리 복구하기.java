import java.util.Scanner;

class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine(); // Move to the next line

        // Loop through each test case
        for (int i = 1; i <= T; i++) {
            String memory = sc.nextLine(); // Read the memory string
            int flips = 0; // Start the flip count at 0
            char previousChar = '0'; // Start with '0' as the initial state

            // Check each character in the memory string
            for (int j = 0; j < memory.length(); j++) {
                char currentChar = memory.charAt(j);
                
                // If the current bit is different, we need a flip
                if (currentChar != previousChar) {
                    flips++;
                    previousChar = currentChar; // Update the previous bit
                }
            }

            // Print the result for this test case
            System.out.println("#" + i + " " + flips);
        }

        sc.close(); // Close the scanner
    }
}
