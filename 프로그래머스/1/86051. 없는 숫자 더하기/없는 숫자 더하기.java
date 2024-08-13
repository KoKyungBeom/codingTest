import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        List<Integer> list = new ArrayList<>();
        
        String lookUpTable = "1234567890";
        
        for(int i = 0; i < numbers.length; i++){
            list.add(numbers[i]);
        }
        
        for(char c : lookUpTable.toCharArray()){
            if(!list.contains(Character.getNumericValue(c))){
                answer += Character.getNumericValue(c);
            }
        }
        
        return answer;
    }
}