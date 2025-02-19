class Solution {
    public int solution(int[] num_list) {
        StringBuilder oddStr = new StringBuilder();
        StringBuilder evenStr = new StringBuilder();

        for (int num : num_list) {
            if (num % 2 == 0) {
                evenStr.append(num);
            } else {
                oddStr.append(num);
            }
        }

        int oddNum = oddStr.length() > 0 ? Integer.parseInt(oddStr.toString()) : 0;
        int evenNum = evenStr.length() > 0 ? Integer.parseInt(evenStr.toString()) : 0;

        return oddNum + evenNum;
    }
}
