import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(int[] arr, int[][] queries) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int[] set : queries) {
            int s = set[0];
            int e = set[1];
            int k = set[2];

            int minVal = Integer.MAX_VALUE;
            boolean found = false;

            for (int i = s; i <= e; i++) {
                if (arr[i] > k && arr[i] < minVal) {
                    minVal = arr[i];
                    found = true;
                }
            }

            if (found) {
                result.add(minVal);
            } else {
                result.add(-1);
            }
        }

        return result;
    }
}
