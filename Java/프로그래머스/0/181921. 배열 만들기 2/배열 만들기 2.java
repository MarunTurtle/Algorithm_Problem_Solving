
import java.util.ArrayList;

class Solution {
    public int[] solution(int l, int r) {
        // Use an ArrayList to dynamically store valid numbers
        ArrayList<Integer> resultList = new ArrayList<>();

        // Loop through all the numbers that are l <= i <= r
        for (int i = l; i <= r; i++) {
            if (containsOnly5Or0(i)) {
                resultList.add(i);
            }
        }

        // If no valid numbers were found, return an array with -1
        if (resultList.isEmpty()) {
            return new int[]{-1};
        }

        // Convert ArrayList to int[]
        int[] resultArray = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            resultArray[i] = resultList.get(i);
        }

        return resultArray;
    }

    private boolean containsOnly5Or0(int num) {
        String numStr = Integer.toString(num);
        for (char c : numStr.toCharArray()) {
            if (c != '5' && c != '0') {
                return false;
            }
        }
        return true;
    }
}
