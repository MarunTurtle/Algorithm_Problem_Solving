public class Solution {
    public String solution (String str, String alp) {
        
        String[] strArr = str.split("");
        
        for (int i = 0; i < str.length(); i++) {
            if (strArr[i].equals(alp)) {
                strArr[i] = strArr[i].toUpperCase();
            }
        }
        
        return String.join("", strArr);
    }
}