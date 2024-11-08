class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        int count1 = 0;
        int count2 = 0;

        if(s.toCharArray()[0] == ')'){
            answer = false;
        }

        for(char c : s.toCharArray()){
            if(c == '('){
                count1++;
            }else{
                count2++;
            }
            if(count2 > count1)
                answer = false;
        }
        if(count1 != count2) answer = false;
        return answer;
    }
}