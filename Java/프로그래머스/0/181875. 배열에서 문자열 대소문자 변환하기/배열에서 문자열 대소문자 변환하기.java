class Solution {
    public String[] solution(String[] strArr) {
        // Declare length
        int length = strArr.length;
        
        // Iterate through the array
        for (int i = 0; i < length; i += 2) {
            // Convert even index to lowercase
            strArr[i] = strArr[i].toLowerCase();
            // Check if the next element exists (to avoid ArrayIndexOutOfBoundsException)
            if (i + 1 < length) {
                // Convert odd index to uppercase
                strArr[i+1] = strArr[i+1].toUpperCase();
            }
        }
        return strArr;
    }
}
