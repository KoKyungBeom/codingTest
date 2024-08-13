import java.util.*;
import java.util.stream.Collectors;

class Solution {
        public int[] solution(int[] arr, int divisor) {
        int[] answer;

        List<Integer> list = new ArrayList();

        for(int i=0; i < arr.length; i++){
            if(arr[i] % divisor == 0){
                list.add(arr[i]);
            }
        }
        
        List<Integer> newList = list.stream().sorted().collect(Collectors.toList());
        
        if (newList.size() == 0){
            answer = new int[]{-1};
        }else {
            answer = new int[newList.size()];
            for (int i=0; i < newList.size(); i++){
                answer[i] = newList.get(i);
            }
        }
        return answer;
    }
}