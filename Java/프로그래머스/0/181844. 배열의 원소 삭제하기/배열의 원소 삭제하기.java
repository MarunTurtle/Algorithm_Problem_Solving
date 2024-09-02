import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        ArrayList<Integer> result = new ArrayList<>();
        
        // Convert delete_list array to a List for easier 'contains' checking
        ArrayList<Integer> deleteList = new ArrayList<>();
        for (int i : delete_list) {
            deleteList.add(i);
        }

        for (int i = 0; i < arr.length; i++) {
            if (!deleteList.contains(arr[i])) {
                result.add(arr[i]);
            }
        }
        
        // Convert ArrayList back to int array
        int[] finalResult = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            finalResult[i] = result.get(i);
        }
        
        return finalResult;
    }
}
