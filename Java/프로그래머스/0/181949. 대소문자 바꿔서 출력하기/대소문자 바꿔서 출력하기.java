import java.util.*;

public class Solution {
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int len = str.length();
    
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < len; i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                sb.append(Character.toLowerCase(str.charAt(i)));
            } else {
                sb.append(Character.toUpperCase(str.charAt(i))); 
            }
        }
        
        System.out.print(sb.toString());
    }
}     