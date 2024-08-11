class Solution {
    public int solution(String[] babbling) {
        int answer = 0;

        String[] str = {"aya", "ye", "woo", "ma"};

        for (String s : babbling) {
            String previousWord = "";
            boolean isValid = true;

            while (!s.isEmpty()) {
                boolean changed = false;

                for (String el : str) {
                    if (s.startsWith(el)) {
                        if (previousWord.equals(el)) {
                            isValid = false;
                            break;
                        }
                        s = s.substring(el.length());
                        previousWord = el;
                        changed = true;
                        break;
                    }
                }
                if (!changed) {
                    isValid = false;
                    break;
                }
            }
            if (isValid) {
                answer++;
            }
        }

        return answer;
    }
}