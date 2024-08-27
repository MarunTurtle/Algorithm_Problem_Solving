import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();


		for(int test_case = 1; test_case <= T; test_case++) {
            // Print the test case
			System.out.printf("#%d ", test_case);
			
			// Declare a matrix that has a size of 15 columns * 5 rows
            Character[][] chars = new Character[5][15];
            
            String[] lines = new String[5];
                  
            // Read 5 lines of String input
            for (int r = 0; r < 5; r++) {
                lines[r] = sc.next();
                int length = lines[r].length();
                // For every character in String, store it in the Matrix
                for (int c = 0; c < length; c++) {
                    chars[r][c] = lines[r].charAt(c);
                }
            }
            
            // Print every character from the matrix by column without line breaking. 
            for (int c = 0; c < 15; c++) {
                for(int r = 0; r < 5; r++) {
                    if (chars[r][c] == null) {
                    } else { 
                        System.out.print(chars[r][c]);
                    }
                }
            }
            System.out.println();
        }

        sc.close();
	}
}
