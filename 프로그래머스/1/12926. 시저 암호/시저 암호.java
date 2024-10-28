class Solution {
    public String solution(String s, int n) {
        // a = 97  A = 65 z = 122 Z = 90
        // 문자열의 각 문자에 유니코드 n 만큼 더해서 새로운 문자열을 만든다
        String answer = "";
        // 문자열을 char 배열로 바꾼다
        char[] charArray = s.toCharArray();
        
        // 각 문자에 유니코드를 n 만큼 더하여 새로운 문자로 만드는데 n을 더했을때 유니코드 123이 넘는다면 97로 돌아와야하고 91을 넘으면 65로 돌아와야한다
        for (char c : charArray) {
            // 공백 일때
            if (c < 65) {
                c = c;
            }
            // 대문자 일때
            else if (c <= 90) {
                // Z일때
                if (c + n > 'Z') {
                    c = (char) (c + n - 26);
                } else {
                    c = (char) (c + n);
                }
            }
            // 소문자 일때
            else if (c >= 97) {
                // z일때
                if (c + n > 'z') {
                    c = (char) (c + n - 26);
                } else {
                c = (char) (c + n);
                }
            }
            answer += c;
         }
        
        return answer;
    }
}