import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int solution(int k, int m, int[] score) {
        //사과의 점수배열 score의 요소는 3부터 사과의 최대점수 k 까지 수로 구성되어있다 한상자에 들어가는 사과의 개수는 m 이다
        //score 배열의 크기를 m으로 나누어 몫이 만들 수 있는 상자의 개수가 되고 나머지는 버린다
        //상자의 가격은 최저점수 * m 이다
        int answer = 0;
        
        List<Integer> scoreList = new ArrayList<>();
        
        for (int i : score) {
            scoreList.add(i);
        }
        
        scoreList.sort(Comparator.reverseOrder());

        for (int i = 0; i + m <= scoreList.size(); i += m) {
            answer += scoreList.get(i + m - 1) * m;
        }

        return answer;
    }
}