import java.util.*;

class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        answer[0] = getGreatestCommonDivisor(n,m);
        answer[1] = getMaxCommonMultiple(n,m);
        return answer;
    }
    public static List getDivisorCount (int num){
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) list.add(i);
        }
        return list;
    }
    public static int getGreatestCommonDivisor (int num1,int num2) {
        int result;

        List commonDivisorList1 = getDivisorCount(num1);
        List commonDivisorList2 = getDivisorCount(num2);
        List commonElementList = new ArrayList();

        for (int i = 0; i < commonDivisorList1.size(); i++) {
            if (commonDivisorList2.contains(commonDivisorList1.get(i))) {
                commonElementList.add(commonDivisorList1.get(i));
            }
        }
        result = (int) commonElementList.get(commonElementList.size()-1);
        return result;
    }
    public static int getMaxCommonMultiple (int num1, int num2) {
        int greatestCommonDivisor = getGreatestCommonDivisor(num1,num2);
        return greatestCommonDivisor * (num1/greatestCommonDivisor) * (num2/greatestCommonDivisor);
    }
}