class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        for (int i = left; i <= right; i++) {
            if (getDivisorCount(i) % 2 == 0) {
                answer += i;
            } else {
                answer += -i;
            }
        }
        
        return answer;
    }
    public static int getDivisorCount (int num){
        int result = 0;
    
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                result ++;
            }
        }
        return result;
    }
}