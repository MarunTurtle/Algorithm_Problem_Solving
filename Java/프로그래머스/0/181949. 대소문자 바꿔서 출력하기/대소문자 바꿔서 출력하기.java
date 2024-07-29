import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        StringBuilder newStr = new StringBuilder();
        
        for (int i = 0; i < str.length(); i++) {
            Character ch = str.charAt(i);
            if (Character.isLowerCase(ch)) {
                newStr.append(Character.toUpperCase(ch));
            } else {
                newStr.append(Character.toLowerCase(ch));
            }
        }
        
        System.out.print(newStr.toString());
        
    }
}