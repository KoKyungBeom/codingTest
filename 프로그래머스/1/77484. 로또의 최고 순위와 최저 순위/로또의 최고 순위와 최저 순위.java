class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        
        int matchNumCount = 0;
        int zeroCount = 0;
        
        for (int i = 0; i < lottos.length; i++) {
            if (lottos[i] == 0) {
                zeroCount++;
            } else {
                for (int j = 0; j < win_nums.length; j++) {
                    if (lottos[i] == win_nums[j]) {
                        matchNumCount++;
                        break;
                    }
                }
            }
        }
        int bestCase = matchNumCount + zeroCount;
        int worstCase = matchNumCount;
        
        answer[0] = getRank(bestCase);
        answer[1] = getRank(worstCase);
        
        return answer;
    }
    
    public int getRank(int count) {
        switch (count) {
            case 6: 
                return 1;
            case 5: 
                return 2;
            case 4: 
                return 3;
            case 3: 
                return 4;
            case 2: 
                return 5;
            default: 
                return 6;
        }
    }
}
