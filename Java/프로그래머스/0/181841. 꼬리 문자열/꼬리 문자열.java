public class Solution {
    public String solution (String[] strList, String ex) {
        StringBuilder sb = new StringBuilder();
        
        for (String str: strList) {
            if (!str.contains(ex)) sb.append(str);
        }
        
        return sb.toString();
    }
}