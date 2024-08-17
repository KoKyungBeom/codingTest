class Solution {
    public String solution(String s) {
        
        String answer = "";

        int index = (int) Math.floor(s.length() / 2);

        if (s.length() % 2 == 0 ) {

            answer = s.substring(index-1,index+1);

        } else {

            answer = String.valueOf(s.charAt(index));

        }

        return answer;
    }
}