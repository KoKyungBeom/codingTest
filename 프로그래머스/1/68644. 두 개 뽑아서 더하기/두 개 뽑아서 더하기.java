import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] numbers) {
        List<Integer> list = new ArrayList();
        
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                list.add(numbers[i] + numbers[j]);
            }
        }
        List<Integer> newList = list.stream()
            .sorted()
            .distinct()
            .collect(Collectors.toList());
        
        int[] answer = new int[newList.size()];
        
        for (int i = 0; i < newList.size(); i++) {
            answer[i] = newList.get(i);
        }
        
        return answer;
    }
}