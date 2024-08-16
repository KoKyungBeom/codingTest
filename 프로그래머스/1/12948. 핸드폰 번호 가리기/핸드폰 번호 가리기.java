class Solution {
    public String solution(String phone_number) {

        String answer = "";

        char[] charArray = phone_number.toCharArray();

        for(int i = 0; i < charArray.length-4; i++){
            charArray[i] = '*';
        }
        answer = String.valueOf(charArray);

        return answer;
    }
}