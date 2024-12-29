using System;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        
        answer = Math.Sqrt(n) % 1 == 0 ? 1 : 2;
        
        return answer;
    }
}