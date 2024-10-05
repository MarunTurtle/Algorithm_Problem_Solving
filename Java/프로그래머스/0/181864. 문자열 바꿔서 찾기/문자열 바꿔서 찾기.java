public class Solution {
    public int solution (String myStr, String pat) {
        String[] strArr = myStr.split("");
        
        for (int i = 0; i < strArr.length; i ++) {
            if (strArr[i].equals("B")) {
                strArr[i] = "A"; 
            } else {
                strArr[i] = "B"; 
            }
        }
        
        String result = String.join("", strArr);
        return result.contains(pat) ? 1 : 0;
     }
}