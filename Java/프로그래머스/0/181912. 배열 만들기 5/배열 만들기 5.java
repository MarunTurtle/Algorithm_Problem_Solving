import java.util.ArrayList;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        
        ArrayList<Integer> resultArray = new ArrayList<>();


        for (String strNum : intStrs) {

            StringBuilder sb = new StringBuilder();

            for (int i = s; i < s + l; i++) {
                sb.append(strNum.charAt(i));
            }

            int num = Integer.parseInt(sb.toString());
            
            if (num > k) {
                resultArray.add(num);
            }
        }
        
        int[] answer = new int[resultArray.size()];
        for (int i = 0; i < resultArray.size(); i++) {
            answer[i] = resultArray.get(i);
        }
        
        return answer;
    }
}