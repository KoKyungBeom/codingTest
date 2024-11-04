class Solution {
    public int solution(int number, int limit, int power) {
        int[] array = new int[number];
        
        for (int i = 0; i < number; i++) {
            if (getDivisorCount(i + 1) > limit) {
                array[i] = power;
            } else {
                array[i] = getDivisorCount(i + 1);
            }
        }
        
        int answer = 0;
        
        for (int i : array) {
            answer += i;
        }
        
        return answer;
    }
    public static int getDivisorCount (int num) {
        int result = 0;
    
        for (int i = 1; i * i <= num; i++) {
            if (i * i == num) {
                result ++;
            } 
            else if(num % i == 0) {
                result += 2;
            }
        }
        return result;
    }
}