import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        List<Integer> list = getDollsArray(board,moves);
        return getCountRemoveDolls(list);
        
    }
    public static List<Integer> getDollsArray(int[][] board, int[] moves) {
        List<Integer> dollsArray = new ArrayList<>();

        int size = board.length;

        for (int i : moves) {
            int index = i - 1;
            boolean isEmpty = false;
            for (int j = 0; j < size; j++) {
                if (board[j][index] != 0) {
                    dollsArray.add(board[j][index]);
                    board[j][index] = 0;
                    isEmpty = true;
                    break;
                }
            }
            if(!isEmpty) dollsArray.add(0);
        }

        return dollsArray;
    }
    public static int getCountRemoveDolls (List<Integer> list) {
        Stack<Integer> stack = new Stack<>();
        
        int count = 0;

        for (int i : list) {
            if (!stack.isEmpty() && stack.peek().equals(i) && i != 0) {
                stack.pop();
                count += 2;
            } else {
                stack.push(i);
            }
        }

        return count;
    }
}
