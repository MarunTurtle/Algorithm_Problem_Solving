public class Solution {
    public String solution (String str, int m, int c){
        String[] strArr = str.split("");
        StringBuilder sb = new StringBuilder();

        for (int i = c-1; i < str.length(); i += m) {
            sb.append(strArr[i]);            
        }
        
        return sb.toString();
    }
}