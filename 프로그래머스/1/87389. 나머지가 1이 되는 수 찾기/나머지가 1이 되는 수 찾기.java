class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i = n-(n-1); i < n; i++){
            if(n % i == 1) {
                answer = i;
                break;
            }
        } 
        
        return answer;
    }
}