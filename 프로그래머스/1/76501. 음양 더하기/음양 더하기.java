import java.util.Arrays;

class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer;
        
        for(int i=0; i < signs.length; i++){
            
            if(signs[i] == false){
                absolutes[i] = -absolutes[i];
            }
        }
        answer = Arrays.stream(Arrays.stream(absolutes).toArray())
                .map(num -> num)
                .sum();
        
        return answer;
    }
}