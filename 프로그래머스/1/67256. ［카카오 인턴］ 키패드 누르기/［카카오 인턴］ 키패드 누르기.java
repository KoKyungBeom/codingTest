import java.util.*;

class Solution {
    public String solution(int[] numbers, String hand) {
        Map<String,Integer> hands = new HashMap();
        hands.put("R",10);
        hands.put("L",11);
        
        String answer = "";
        
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
                answer += "L";
                hands.put("L",numbers[i]);
            }
            else if (numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {
                answer += "R";
                hands.put("R",numbers[i]);
            }
            else {
                answer += selectHand(numbers[i],hands,hand);
            }
        }
        
        return answer;
    }
    public static String selectHand(int pushNum,Map<String,Integer> hands,String hand) {
        if (getDistance(pushNum,hands.get("R")) == getDistance(pushNum,hands.get("L"))) {
            if (hand.equals("right")){
                hands.put("R",pushNum);
                return "R";
            }else {
                hands.put("L",pushNum);
                return "L";
            }

        } else if (getDistance(pushNum,hands.get("L")) > getDistance(pushNum,hands.get("R"))) {
            hands.put("R",pushNum);
            return "R";

        }else {
            hands.put("L",pushNum);
            return "L";
        }
    }
    public static int getDistance(int pushNum, int previousNum) {
        switch (pushNum) {
            case 2: switch (previousNum) {
                case 1,3,5 : return 1;
                case 4,6,8 : return 2;
                case 7,0,9 : return 3;
                case 10,11 : return 4;
                default: return 0;
            }
            case 5 : switch (previousNum) {
                case 2,4,6,8 : return 1;
                case 1,3,7,9,0 : return 2;
                case 10,11 : return 3;
                default: return 0;
            }
            case 8 : switch (previousNum) {
                case 0,5,7,9 : return 1;
                case 2,4,6,10,11 : return 2;
                case 1,3 : return 3;
                default: return 0;
            }
            case 0 : switch (previousNum) {
                case 8,10,11 : return 1;
                case 5,7,9 : return 2;
                case 2,4,6 : return 3;
                case 1,3 : return 4;
                default: return 0;
            }
            default:return 0;
        }
    }
}