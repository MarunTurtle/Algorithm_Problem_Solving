import java.util.*;

public class Solution {
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int len = str.length();
        
        for (int i = 0; i < len; i++) {
            System.out.println(str.charAt(i));
        }
        // for (char c : str.toCharArray()) {
        //     System.out.println(c);
    }
}