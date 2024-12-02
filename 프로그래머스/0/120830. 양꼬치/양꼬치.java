class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int drink = n / 10;
        
        answer = n * 12000 + k * 2000 - drink * 2000;
        
        return answer;
    }
}