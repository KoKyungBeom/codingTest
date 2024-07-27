class Solution {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        
        int[] newArray = new int[a.length];
        
        for (int i = 0; i < a.length; i++) {
            newArray[i] = a[i]*b[i];
            answer += newArray[i];
        }
        
        return answer;
    }
}