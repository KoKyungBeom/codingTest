import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] array1 = makeArray1(answers.length);
        int[] array2 = makeArray2(answers.length);
        int[] array3 = makeArray3(answers.length);
        
        int count1 = countMatches(answers, array1);
        int count2 = countMatches(answers, array2);
        int count3 = countMatches(answers, array3);
        
        int maxCount = Math.max(count1, Math.max(count2, count3));
        
        List<Integer> answer = new ArrayList<>();
        if (count1 == maxCount) answer.add(1);
        if (count2 == maxCount) answer.add(2);
        if (count3 == maxCount) answer.add(3);

        return answer.stream()
                     .sorted()
                     .mapToInt(el -> el)
                     .toArray();
    }
    public static int[] makeArray1(int n) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = (i % 5) + 1;
        }
        return array;
    }
    
    public static int[] makeArray2(int n) {
        int[] pattern = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] array = new int[n];
        
        for (int i = 0; i < n; i++) {
            array[i] = pattern[i % pattern.length];
        }
        
        return array;
    }
    
    public static int[] makeArray3(int n) {
        int[] pattern = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = pattern[i % pattern.length];
        }

        return array;
    }
    public static int countMatches(int[] arr1, int[] arr2) {
        int count = 0;
        
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == arr2[i]) {
                count++;
            }
        }
        
        return count;
    }
}