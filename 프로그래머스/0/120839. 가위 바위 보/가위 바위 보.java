import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String rsp) {
        Map<Character, Character> rspMap = new HashMap<>();
        rspMap.put('2', '0');
        rspMap.put('0', '5');
        rspMap.put('5', '2');

        StringBuilder answer = new StringBuilder();
        
        for (char current : rsp.toCharArray()) {
            answer.append(rspMap.get(current));
        }
        
        return answer.toString();
    }
}
