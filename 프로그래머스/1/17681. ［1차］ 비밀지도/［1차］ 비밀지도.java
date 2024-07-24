import java.util.*;

class Solution {
   public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        Arrays.fill(answer, "");

        String[] arr1ToBi = new String[n];
        String[] arr2ToBi = new String[n];
        String[] sumArrayToString = new String[n];
        Arrays.fill(sumArrayToString, ""); 

        for (int i = 0; i < n; i++) {
            arr1ToBi[i] = String.format("%" + n + "s", Integer.toBinaryString(arr1[i])).replace(' ', '0');
            arr2ToBi[i] = String.format("%" + n + "s", Integer.toBinaryString(arr2[i])).replace(' ', '0');
        }

        for (int i = 0; i < n; i++) {
            StringBuilder sumArray = new StringBuilder();
            for (int j = 0; j < n; j++) {
            int sum = (arr1ToBi[i].charAt(j) - '0') + (arr2ToBi[i].charAt(j) - '0');
            sumArray.append(sum);
            }
            sumArrayToString[i] = sumArray.toString();
        }

        for (int i = 0; i < n; i++) {
            for (char c : sumArrayToString[i].toCharArray()) {
                if (c != '0') {
                    answer[i] += "#";
                } else {
                    answer[i] += " ";
                }
            }
        }

        return answer;
    }
}