import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        int r = sc.nextInt();
        System.out.print(word.repeat(r));
        } 
}