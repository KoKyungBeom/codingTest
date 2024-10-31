class Solution {
     public static String solution(int[] food) {

        String answer = "";

        for(int i = 1; i < food.length; i++){
            
            String str = String.valueOf(i);
            
            answer += str.repeat(food[i]/2);
             
        }
        answer += "0";

        String front = answer.substring(0, answer.indexOf('0'));
         
        String back = "";
         
        for (int i = front.length() - 1; i >= 0; i--) {
            
            back += front.charAt(i);
            
        }
        
        answer = front + "0" + back;

        return answer;
    }
}