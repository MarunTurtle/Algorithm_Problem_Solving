import java.util.LinkedList;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Loop through 10 test cases
        for (int testCase = 1; testCase <= 10; testCase++) {
            
            // Read the length of the original list (cipher)
            int N = sc.nextInt();
            LinkedList<Integer> cipher = new LinkedList<>();
            
            // Add numbers to the cipher list
            for (int i = 0; i < N; i++) {
                cipher.add(sc.nextInt());
            }

            // Read how many commands there are
            int commandCount = sc.nextInt();

            // Process each command
            for (int i = 0; i < commandCount; i++) {
                sc.next(); // Skip "I", as the command is always "I"
                int x = sc.nextInt(); // Position to insert numbers
                int y = sc.nextInt(); // How many numbers to insert

                // Insert the numbers at the specified position
                for (int j = 0; j < y; j++) {
                    int s = sc.nextInt();
                    cipher.add(x + j, s);
                }
            }

            // Output the first 10 numbers from the modified cipher list
            System.out.print("#" + testCase + " ");
            for (int i = 0; i < 10 && i < cipher.size(); i++) {
                System.out.print(cipher.get(i) + " ");
            }
            System.out.println();
        }

        sc.close(); // Close the scanner
    }
}
