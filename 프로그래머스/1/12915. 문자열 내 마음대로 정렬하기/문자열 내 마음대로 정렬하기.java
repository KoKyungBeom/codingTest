import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        //문자배열을 순회하며 안에 문자의 n번째 인덱스를 확인 아마 유니코드?
        //각 문자의 n번째 인덱스의 값을 오름차순으로 순서를 변경한 문자배열을 반환
        String[] answer = new String[strings.length];
        
        String str = "";
        
        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings.length - i - 1; j++) {
                if (strings[j].charAt(n) > strings[j+1].charAt(n) ||
                        (strings[j].charAt(n) == strings[j+1].charAt(n) && strings[j].compareTo(strings[j+1]) > 0)) {
                    str = strings[j];
                    strings[j] = strings[j+1];
                    strings[j+1] = str;
                }

            }
        }
        for (int i = 0; i < strings.length; i++) {
            answer[i] = strings[i];
        }
        return answer;
    }
}