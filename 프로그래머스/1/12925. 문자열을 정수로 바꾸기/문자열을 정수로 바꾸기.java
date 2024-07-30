class Solution {
    public int solution(String s) {
        int answer = 0;

        if (s.toCharArray()[0] == '-') {
            s.replace("-", "");
        }

        answer = Integer.parseInt(s);

        return answer;
    }
}