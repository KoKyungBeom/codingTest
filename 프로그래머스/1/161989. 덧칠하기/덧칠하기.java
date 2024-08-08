class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 1;
        
        int startNum = section[0];

        for (int i = 1; i < section.length; i++) {
            if (section[i] - startNum >= m) {
                answer++;
                startNum = section[i];  
            }
        }

        return answer;
    }
}