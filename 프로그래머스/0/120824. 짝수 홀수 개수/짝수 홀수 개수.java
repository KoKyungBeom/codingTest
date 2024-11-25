class Solution {
    public int[] solution(int[] num_list) {
        int evenCount = 0;
        int oddCount = 0;
        
        // num_list 배열을 순회하면서 짝수와 홀수 개수를 셈
        for (int num : num_list) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        
        // 짝수 개수와 홀수 개수를 담은 배열 반환
        return new int[]{evenCount, oddCount};
    }
}
