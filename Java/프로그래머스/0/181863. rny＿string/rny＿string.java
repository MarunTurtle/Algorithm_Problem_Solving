class Solution { 
    public String solution(String str) {
        
        
        String[] strArr = str.split("");
        int len = str.length();
        
        for (int i = 0; i < len; i++) {
            if (strArr[i].equals("m")) {
                strArr[i] = "rn";
            }
        }
        
        return String.join("", strArr);
    }
}