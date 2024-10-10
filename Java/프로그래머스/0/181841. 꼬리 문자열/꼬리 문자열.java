public class Solution {
    public String solution (String[] strList, String ex) {
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < strList.length; i++) {
            if (!strList[i].contains(ex)) {
                sb.append(strList[i]);  
            } 
        }
        
        return sb.toString();        
    }
}