class Solution {
    public int solution(int n) {
        return ternaryToDecimalReversed(Integer.toString(n,3));
    }
    public static int ternaryToDecimalReversed (String ternary) {
        StringBuilder sb = new StringBuilder(ternary);
        String newStr = sb.reverse().toString();
        int num = Integer.parseInt(newStr,3);
        return num;
    }
}