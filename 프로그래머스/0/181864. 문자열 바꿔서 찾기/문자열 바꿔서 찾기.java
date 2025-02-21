class Solution {
    public int solution(String myString, String pat) {
        StringBuilder converted = new StringBuilder();
        
        for (char c : myString.toCharArray()) {
            if (c == 'A') {
                converted.append('B');
            } else {
                converted.append('A');
            }
        }
        
        return converted.toString().contains(pat) ? 1 : 0;
    }
}
