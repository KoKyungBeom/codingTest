class Solution {
    public int solution(String[] babbling) {
        int answer = 0;

        String[] str = {"aya", "ye", "woo", "ma"};

        for (String s : babbling) {
            String previous = "";
            boolean isValid = true;

            while (!s.isEmpty()) {
                boolean found = false;

                for (String el : str) {
                    if (s.startsWith(el)) {
                        if (previous.equals(el)) {
                            isValid = false;
                            break;
                        }

                        s = s.substring(el.length());
                        previous = el;
                        found = true;
                        break;
                    }
                }

                if (!found) {
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