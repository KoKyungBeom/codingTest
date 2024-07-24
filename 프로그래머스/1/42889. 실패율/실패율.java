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