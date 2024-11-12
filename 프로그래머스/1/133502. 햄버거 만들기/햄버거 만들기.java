import java.util.*;

class Solution {
    public static int solution(int[] ingredient) {
        
        int answer = 0;
        
        Stack<Integer> stack = new Stack<>();

        for (int i : ingredient) {
            stack.push(i);
            
            while (stack.size() >= 4 && stack.peek() == 1 && stack.get(stack.size() - 2) == 3 
                    && stack.get(stack.size() - 3) == 2 && stack.get(stack.size() - 4) == 1) {
                answer ++;
                stack.pop();
                stack.pop();
                stack.pop();
                stack.pop();
            }
        }

        return answer;
    }

}