import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = Arrays.stream(numbers) 
                             .map(el -> el * 2) 
                             .toArray();
                             
        return answer;
    }
}
