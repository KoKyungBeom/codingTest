class Solution {
    public int solution(String s) {
        return partString(s);
        
    }
    public static int partString (String s) {
        int sameCount = 0;
        int differenceCount = 0;
        int cutCount = 0;
        int currentIndex = 0;
        int length = s.length();
        for (int i = 0; i < length; i++) {
            char start = s.charAt(0);
            char ch = s.charAt(currentIndex);
            if (start == s.charAt(currentIndex)) {
                sameCount ++;
                currentIndex++;
            } else {
                differenceCount++;
                currentIndex++;
            }
            if (sameCount == differenceCount) {
                s = s.substring(currentIndex);
                sameCount = 0;
                differenceCount = 0;
                cutCount++;
                currentIndex = 0;
            }
            if (sameCount != differenceCount && i == length - 1){
                cutCount++;
            }
        }
        return cutCount;
    }
}