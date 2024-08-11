class Solution {
    public long solution(int num) {
        
        long answer = 0;
        
        long castingNum = (long) num;
        
        if(num == 1) return 0;

        while(castingNum != 1) {
            
            if(answer == 500) return -1;
            
            if(castingNum % 2 == 0) {
                
                castingNum = castingNum / 2;
                
            } else {
                
                castingNum = castingNum * 3 + 1;
            }
            
            answer++;
        }
        
        return answer;
    }
}