import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        int r = sc.nextInt();
        for (int i = 0; i < r; i++) {
            System.out.print(word);
        }        
    }
}