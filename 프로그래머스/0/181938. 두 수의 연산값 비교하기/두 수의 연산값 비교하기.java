class Solution {
    public int solution(int a, int b) {
        String stringValue = Integer.toString(a) + Integer.toString(b);
        
        int plusValue = Integer.parseInt(stringValue);
        
        int multValue = 2 * a * b;
        
        return plusValue >= multValue ? plusValue : multValue;
    }
}