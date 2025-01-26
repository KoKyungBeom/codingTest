import java.util.*;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> divisorList = new ArrayList<>();
        
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                divisorList.add(i);
            }
        }
        
        int[] answer = divisorList.stream().mapToInt(i -> i).toArray();
        
        return answer;
    }
}
