import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        StringBuilder newStr = new StringBuilder();    
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int strInt = (int) ch;
            if (strInt < 97) {
                strInt += 32;
            } else {
                strInt -= 32;
            }
            newStr.append((char) strInt);
        }
        System.out.print(newStr);
    }
}