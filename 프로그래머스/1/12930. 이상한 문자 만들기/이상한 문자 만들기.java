class Solution {
    public String solution(String s) {
        String answer = "";
        
        //단어를 구분하는 공백을 기준으로 문자열을 잘라서 배열에 담아둔다
        String[] result = s.split(" ", - 1);
        
        //단어를 담아둔 배열을 순회한다
        for (int i = 0; i < result.length; i++) {
            
            result[i] = result[i].toUpperCase();
            char[] charArray = result[i].toCharArray();
            
            for (int j = 0; j < charArray.length; j++) {
                if (j % 2 == 0) {
                    answer += (char) charArray[j];
                } else {
                    answer += (char) (charArray[j] + 32);
                }
            }
            result[i] = answer;
            answer = "";
        }
        
        for (int i = 0; i < result.length; i++) {
            answer += result[i] + " ";
            if (i == result.length - 1) {
                answer = answer.substring(0,answer.length()-1);
            }
        }
        
        return answer;
    }
}