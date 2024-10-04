class Solution {
    public int solution(String myString, String pat) {
        String[] changed = myString.split("");

        for (int i = 0; i < changed.length; i++) {
            if (changed[i].equals("A")) {
                changed[i] = "B";
            } else {
                changed[i] = "A";
            }
        }

        String chStr = String.join("", changed);

        return chStr.contains(pat) ? 1 : 0;  
    }
}
