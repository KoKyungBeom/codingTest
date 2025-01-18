class Solution {
    public int solution(int hp) {
        int g_ent = 0;
        int s_ent = 0;
        int w_ent = 0;
        
        g_ent = hp / 5;
        
        hp = hp - (5 * g_ent);
        
        s_ent = hp / 3;
        
        hp = hp - (3 * s_ent);
        
        w_ent = hp;
        
        int answer = g_ent + s_ent + w_ent;
            
        return answer;
    }
}