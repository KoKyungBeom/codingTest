class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        
        int sum = 0;
        
        for(char c : Integer.toString(x).toCharArray()){
            sum += Character.getNumericValue(c);
        }
        
        if(x % sum != 0) answer = false;
            
        return answer;
    }
}