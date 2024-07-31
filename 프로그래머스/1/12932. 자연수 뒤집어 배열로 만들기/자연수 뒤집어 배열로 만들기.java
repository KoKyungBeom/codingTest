class Solution {
    public int[] solution(long n) {
        
        String str = Long.toString(n);
        //int[] answer = {}; 이렇게 했을경우 배열이라 사이즈가 고정되어 더 추가할 수가 없게된다 그렇기 때문에 매개변수로 받은 n을 String 타입으로 바꾸고 그 사이즈에 맞는 배열을 만들어줘야한다
        int[] answer = new int[str.length()];
        //String 타입으로 바꾼뒤 다시 char 배열로 바꾸는과정에서 java 에서 char 타입은 유니코드로 해석하기때문에 -'0'을 안해준다면 숫자자체를 유니코드로 변환하여 제대로된 값을 구할 수 없다
        for (int i = 0; i < str.length(); i++) {
            answer[i] = str.toCharArray()[str.length() - i - 1] - '0';
        }

        return answer;
    }
}