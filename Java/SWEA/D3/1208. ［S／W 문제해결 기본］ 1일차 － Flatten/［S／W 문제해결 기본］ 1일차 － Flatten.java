// import java.io.FileInputStream;
import java.util.Scanner;

class Solution {
    public static void main(String args[]) throws Exception {
        // System.setIn(new FileInputStream("./input.txt"));
        Scanner sc = new Scanner(System.in);
        int T = 10;

        for (int t = 1; t <= T; t++) {
            // Get dump limitation
            int dumpLimit = sc.nextInt();
            
            // Get nubmer of boxes
            int[] boxes = new int[100];
            for (int i = 0; i < 100; i++) {
                boxes[i] = sc.nextInt();
            }
            
            for (int l = 0; l < dumpLimit; l++) {
                
                countingSort(boxes);

                // Dump: Subtract 1 from the last index & Add 1 to the first index
                boxes[0] ++;
                boxes[boxes.length - 1] --;

                countingSort(boxes);
            }
        
            // result
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;

            for (int box: boxes) {
                if (box > max) max = box;
                if (box < min) min = box;
            }
            
            int result = max - min;

            System.out.printf("#%d %d\n", t, result);
        }
    }

    private static void countingSort(int[] boxes) {
        int [] countBoxes = new int[101]; //Adjust size to handle 100 box
        // Sort the box 
        // Arrays.sort(boxes);
        
        // Use counting sort                
        for (int n : boxes) {
            countBoxes[n]++;
        }
        
        int index = 0;
        for (int i = 0; i < countBoxes.length; i++) {
            while (countBoxes[i] > 0) {
                boxes[index++] = i;
                countBoxes[i]--;
            }    
        }
    }
}