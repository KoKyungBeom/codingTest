public class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);

            if (c >= 'A' && c <= 'Z') {
                result.append((char) (c + 32));
            }
            else {
                result.append((char) (c - 32));
            }
        }
        
        answer = result.toString();

        return answer;
    }
}