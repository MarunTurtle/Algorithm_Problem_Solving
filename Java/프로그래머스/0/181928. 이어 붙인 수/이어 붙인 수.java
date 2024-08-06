class Solution {
    public int solution(int[] num_list) {

        String EvenString = "";
        String OddString = "";

        for (int n : num_list) {
            if (n % 2 == 0) {
                EvenString += "" + n;
            } else {
                OddString += "" + n;
            }
        }

        return Integer.parseInt(OddString) + Integer.parseInt(EvenString);

    }
}