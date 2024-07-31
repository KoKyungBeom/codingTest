class Solution {
    public long solution(long n) {
       long answer = 0;

        String strAnswer = "";

        String str = Long.toString(n);

        char[] chars = str.toCharArray();
        //chars를 내림차순으로 정렬
        for (int i = 0; i < chars.length - 1; i++) {
            for (int j = 0; j < chars.length - 1 - i; j++) {
                if (chars[j] < chars[j + 1]) {
                    char c = chars[j];
                    chars[j] = chars[j + 1];
                    chars[j + 1] = c;
                }
            }
        }
        //chars를 바로 숫자로 바꿀수 없으니 공백 문자열에 배열의 요소를 모두 추가
        for(int i=0; i < chars.length; i++){
            strAnswer += chars[i];
        }
        //배열의 요소가 모두 추가된 문자열을 long타입으로 변환
        answer = Long.parseLong(strAnswer);

        return answer;
    }
}