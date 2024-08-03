import java.util.*;

class Solution {
    public int solution(String s) {
        String[] numbers = {"zero","one","two","three","four","five","six","seven","eight","nine"};

        StringBuilder answer = new StringBuilder();
        StringBuilder number = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                if (number.length() > 0) {
                    answer.append(changeStringToNumber(number.toString(), numbers));
                    number.delete(0,number.length());
                }
                answer.append(c);
            } else {
                number.append(c);
                for (int i = 0; i < numbers.length; i++) {
                    if (numbers[i].equals(number.toString())) {
                        answer.append(changeStringToNumber(number.toString(), numbers));
                        number.delete(0,number.length());
                        break;
                    }
                }
            }
        }
        if (number.length() > 0) {
            answer.append(changeStringToNumber(number.toString(), numbers));
        }

        return Integer.parseInt(answer.toString());
    }
    public static String changeStringToNumber(String number, String[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i].equals(number)) {
                return String.valueOf(i);
            }
        }
        return "";
    }
}

