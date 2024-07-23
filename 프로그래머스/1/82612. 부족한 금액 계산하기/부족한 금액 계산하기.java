class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        
        long castingMoney = (long) money;
        
        for (int i = 1; i <= count; i++) {
            castingMoney = castingMoney - price * i;
        }
        if(castingMoney < 0) return answer = -castingMoney;
        
        return answer;
    }
}