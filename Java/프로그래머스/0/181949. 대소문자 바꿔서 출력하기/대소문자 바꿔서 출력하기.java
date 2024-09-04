import java.util.*;

public class Solution {
    public static void main (String[] args) {
        
        StringBuilder nstr = new StringBuilder();
        
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                nstr.append(Character.toLowerCase(str.charAt(i)));
            } else {
                nstr.append(Character.toUpperCase(str.charAt(i)));
            }
        }
        
        System.out.println(nstr.toString());
    }
}