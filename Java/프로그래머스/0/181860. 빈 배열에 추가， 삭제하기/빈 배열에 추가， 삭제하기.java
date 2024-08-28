import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        ArrayList<Integer> X = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            if (flag[i]) {
                // Add arr[i] to X arr[i] * 2 times
                for (int j = 0; j < arr[i] * 2; j++) {
                    X.add(arr[i]);
                }
            } else {
                // Remove the last arr[i] elements from X
                for (int j = 0; j < arr[i]; j++) {
                    X.remove(X.size() - 1);
                }
            }
        }
        
        // Convert the ArrayList to an int array
        int[] result = new int[X.size()];
        for (int i = 0; i < X.size(); i++) {
            result[i] = X.get(i);
        }
        
        return result;
    }
}
