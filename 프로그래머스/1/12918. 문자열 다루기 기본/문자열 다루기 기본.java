class Solution {
    public boolean solution(String s) {
        if (s.length() == 4) {
            return isValidNumString(s);
        } else if (s.length() == 6) {
            return isValidNumString(s);
        } else {
            return false;
        }
    }
    public static boolean isValidNumString (String str) {
        String lookUpTable = "0123456789";
        for (char c : str.toCharArray()) {
            if (lookUpTable.indexOf(c) == -1) {
                return false;
            }
        }
        return true;
    }
}