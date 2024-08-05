import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        Map<String, Integer> score = new HashMap();
        
        for (int i = 0; i < name.length; i++) {
            score.put(name[i], yearning[i]);
        }
        
        return sumScore(score,photo);
    }
    public static int[] sumScore (Map<String, Integer> score, String[][] photo) {
        int[] result = new int[photo.length];

        for (int i = 0; i < photo.length; i++) {
            int sum = 0;
            
            for (String s : photo[i]) {
                sum += score.getOrDefault(s, 0);
            }
            result[i] = sum;
        }

    return result;
    }
}