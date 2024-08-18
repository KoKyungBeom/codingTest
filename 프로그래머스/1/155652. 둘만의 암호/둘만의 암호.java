import java.util.*;

class Solution {
    public String solution(String s, String skip, int index) {
        return password(s,skip,index);
    }
    public static String password(String s, String skip, int index) {
    String answer = "";
    char[] sChar = s.toCharArray();
    char[] skipChar = skip.toCharArray();

    List<Character> answerChar = new ArrayList<>();
    
    boolean[] skipCheck = new boolean[26];
        
    for (char ch : skipChar) {
        skipCheck[ch - 'a'] = true;
    }

    for (char c : sChar) {
        int count = 0;
        char newChar = c;
        
        while (count < index) {
            newChar++;
            if (newChar > 'z') {
                newChar = 'a';
            }
            if (!skipCheck[newChar - 'a']) {
                count++;
            }
        }
        answerChar.add(newChar);
    }

    for (char ch : answerChar) {
        answer += ch;
    }

        return answer;
    }
}