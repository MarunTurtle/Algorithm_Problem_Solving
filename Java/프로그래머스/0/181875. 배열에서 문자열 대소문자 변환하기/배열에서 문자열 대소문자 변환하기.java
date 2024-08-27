class Solution {
    public String[] solution(String[] strArr) {
        // Iterate through the array
        for (int i = 0; i < strArr.length; i++) {
            // Use the ternary operator to decide whether to convert to lowercase or uppercase
            strArr[i] = (i % 2 == 0) ? strArr[i].toLowerCase() : strArr[i].toUpperCase();
        }
        return strArr;
    }
}
