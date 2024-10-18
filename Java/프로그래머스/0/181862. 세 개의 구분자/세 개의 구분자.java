import java.util.StringTokenizer;
class Solution {
    public String[] solution(String myStr) {
        String[] answer = {};
        StringTokenizer st = new StringTokenizer(myStr,"abc");
        if(st.countTokens() != 0){
            answer = new String[st.countTokens()];
            for(int i=0; i<answer.length; i++){
                answer[i] = st.nextToken();
            }
        }else{
            answer = new String[1];
            answer[0] = "EMPTY";
        }

        return answer;
    }
}
