import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String result = (n % 2 == 0) ? String.format("%d is even", n) : String.format("%d is odd", n);
        System.out.print(result);
    }
}