import static java.lang.String.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String str = Integer.toString(n);

        for (int i = 0; i < str.length(); i++) {
            answer += Integer.parseInt(valueOf(str.charAt(i)));

        }
        return answer;
    }
}