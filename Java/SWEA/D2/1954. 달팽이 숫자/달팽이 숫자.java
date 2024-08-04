import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
    	
    	// Get input from the user
    	Scanner sc = new Scanner(System.in);
    	
//		System.out.print("Insert rounds: ");
    	int rounds = sc.nextInt(); //Number of rounds  	
    	
    	//If the user inserts a negative input, reject and ask for a positive integer
//    	while (rounds < 0) {
//    		System.out.println("Insert a positive integer for the number of rounds");
//    		System.out.print("Insert rounds: ");
//    		rounds = sc.nextInt();
//    	}
    	
    	// Use for-loop for fixed number of rounds 
    	for (int i = 0; i < rounds; i++) {

    		// Print current round
    		System.out.printf("#%d", i+1);
    		System.out.println();
    		
    		// Run snailMatrixGenerator
    		snailMatrixGenerator(sc);
    	}
    	sc.close();	
    }

	private static void snailMatrixGenerator(Scanner sc) {
		// Ask for input to the user
		
//		System.out.print("Insert size: ");
    	int s = sc.nextInt(); // Size 	
		
    	//If the user inserts a negative input, reject and ask for a positive integer
//		while (s <= 0) {
//    		System.out.println("Insert a positive integer for the size of the matrix");
//    		System.out.print("Insert size: ");
//    		s = sc.nextInt();
//    	}
//		
		// Initialize a s*s matrix using the size variable
		int[][] matrix = new int[s][s];

		// Declare top, bottom, right, left variables to keep records of the movements.    		
		
		int top = 0;
		int bottom = s-1;
		int left = 0;
		int right = s-1;
		
		// Declare value variable
		int value = 1;
		
		//  While value is lower than int s*s
		while (value <= s*s) {
			// Runs through the top side
			for (int i = left; i <= right; i++) {
				if (matrix[top][i] == 0) {
					matrix[top][i] = value;
					value++;
				} else {
					break;
				}
			}
			top++;
			
			// Runs through the right side
			for (int i = top; i <= bottom; i++) {
				if (matrix[i][right] == 0) {
					matrix[i][right] = value;
					value++;
				} else {
					break;
				}
			}
			right--;
			
			// Runs through the bottom side
			for (int i = right; i >= left; i--) {
				if (matrix[bottom][i] == 0) {
					matrix[bottom][i] = value;
					value++;
				} else {
					break;
				}
			}
			bottom--;
			  			   			
			// Runs through the left side
			for (int i = bottom; i >= top; i--) {
				if (matrix[i][left] == 0) {
					matrix[i][left] = value;
					value++;
				} else {
					break;
				}
			}
			left++;
			    			
		}
		
		// Print the result of snailMatrix
		for (int i = 0; i < s; i++) {
			for (int j = 0; j < s; j++) {
				System.out.printf("%d ", matrix[i][j]);
			}
			System.out.println();
		}
		
		// Top: First, insert numbers from [0][0] to [0][s-1]
				
				// Right: Then, insert numbers from [1][s-1] to [s-1][s-1]
		
						// Bottom: Then, insert numbers from [s-1][s-2] to [s-1][0]
		
							// Left: Then, insert numbers from [s-2][0] to [1][0]
		
		// Then, insert numbers from [1][1] to [1][s-2]

				// Then, insert numbers from [2][s-2] to [s-2][s-2]
			
						// Then, insert numbers from [s-2][s-3] to [s-2][1]
		
							// Then, insert numbers from [s-3][1] to [2][1]
								
		// ...to infinity... and beyond! 
	}
}
