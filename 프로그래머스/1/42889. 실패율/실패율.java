import java.util.*;

class Solution {
    public static int[] solution(int N, int[] stages) {
        int[] answer = new int[N];

        double userNum = stages.length;

        double count = 0;

        Map<Integer,Double> failure = new HashMap();

        for (int i = 1; i <= N; i++) {
            for (int j = 0; j < stages.length; j++) {
                if (i == stages[j]) {
                    count++;
                }
            }
            if ( userNum == 0 ) failure.put(i,0.0);
            else {
                failure.put(i, (count / userNum));
                System.out.printf("%s,%s \n", i, (count / userNum));
                userNum = userNum - count;
                count = 0;
            }
        }

        List<Map.Entry<Integer, Double>> list = new ArrayList<>(failure.entrySet());
        list.sort((i, rate) -> rate.getValue().compareTo(i.getValue()));

        for (int i = 0; i < N; i++) {
            answer[i] = list.get(i).getKey();
        }

        return answer;
    }
}
//1,1,1,2,3,4 5
// N = 스테이지의수
// stages = 사용자들의 해당스테이지 배열
// stages.length = 사용자의수
// stages[i] = 사용자의 현재 스테이지
// 1 <= stages[i] <= N+1