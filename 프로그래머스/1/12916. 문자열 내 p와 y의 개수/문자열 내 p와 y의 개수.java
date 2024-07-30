class Solution {
    boolean solution(String s) {
       boolean answer = true;
        int pCount = 0;
        int yCount = 0;
//        s.toUpperCase(); 이렇게 사용하면 s가 바뀔줄 알았으나 변화가 없음 toUpperCase 를 사용하여 새로운 변수에 할당해줘야 함
        String str = s.toUpperCase();

        for (char c : str.toCharArray()) {
            if (c == 'P') pCount++;
            if (c == 'Y') yCount++;
        }
        if (pCount != yCount) answer = false;

        return answer;
    }
}