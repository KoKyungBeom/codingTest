import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
       int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int[] commandArray = commands[i];
            int[] newCommandArray = Arrays.copyOfRange(array,commandArray[0]-1,commandArray[1]);
            Arrays.sort(newCommandArray);
            answer[i] = newCommandArray[commandArray[2]-1];
        }

        return answer;
    }
}