class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for (int i = 0; i <= n; i++) {
            if (primeNumber(i)) answer ++;
        }
        
        return answer;
    }
    public static boolean primeNumber (int n) {
        if (n == 0 || n == 1) return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}