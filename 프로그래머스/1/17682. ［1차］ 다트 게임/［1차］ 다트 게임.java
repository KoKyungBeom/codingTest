import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Solution {
    public static long solution(String dartResult) {
        long answer = 0;

        Map<Integer, Character> specialChar = new HashMap<>();

        int count = 0;

        specialChar.put(1, '0');
        specialChar.put(2, '0');
        specialChar.put(3, '0');

        for (int i = 0; i < dartResult.length(); i++) {
            char c = dartResult.charAt(i);
            if (Character.isDigit(c)){
                count ++;
            }else if (!Character.isLetterOrDigit(c) && !Character.isWhitespace(c)) {
                if (count <= 3) {
                    specialChar.put(count, c);
                }
            }
        }

        String newStr = dartResult.replaceAll("[*#]", "");

        List<Integer> scores = new ArrayList<>();

        Pattern pattern = Pattern.compile("(\\d+)([SDT])");
        Matcher matcher = pattern.matcher(newStr);

        while (matcher.find()) {
            int number = Integer.parseInt(matcher.group(1));
            char ch = matcher.group(2).charAt(0);

            switch (ch) {
                case 'S':
                    scores.add(number);
                    break;
                case 'D':
                    scores.add((int) Math.pow(number, 2));
                    break;
                case 'T':
                    scores.add((int) Math.pow(number, 3));
                    break;
                default:
                    break;
            }
        }
        for(int i = 0; i < scores.size(); i++){
            int key = i+1;
            if(specialChar.containsKey(key)){
                char ch = specialChar.get(key);
                if(ch == '*'){
                    scores.set(i,scores.get(i) * 2);
                    if(i > 0){
                        scores.set(i-1,scores.get(i-1)*2);
                    }
                }
                if(ch == '#'){
                    scores.set(i,scores.get(i) * -1);
                }
            }
        }
        for(long s : scores){
            answer += s;
        }
        return answer;
    }
}