class Solution {
    public int solution(int[] number) {
        // 배열에 있는 숫자 3개를 뽑아서 더하여 0이 될때 카운트를 증가한다 
        int answer = 0;
        
        for (int i = 0; i < number.length - 2; i++){
            for (int j = i+1; j < number.length; j++){
                for (int k = j+1; k < number.length; k++){
                    if(number[i] + number[j] + number[k] == 0) 
                        answer++;
                } 
            }
        }
        
        return answer;
    }
}