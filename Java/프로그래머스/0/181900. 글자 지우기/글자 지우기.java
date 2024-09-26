class Solution {
    public String solution (String str, int[] idxs) {
        
        String[] arr = str.split("");
        
        for (int idx : idxs) {
            arr[idx] = "";
        }
        
        return String.join("", arr);
    }
}