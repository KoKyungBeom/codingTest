class Solution {
    public String solution(String s) {
        return descendingString(s);
    }
    public static String descendingString (String str) {
        char[] charArray = str.toCharArray();

        char temp;

        for(int i = 0; i < charArray.length; i++) {
            for(int j = 0; j < charArray.length-i-1; j++){
                if(charArray[j] < charArray[j + 1]) {
                    temp = charArray[j];
                    charArray[j] = charArray[j+1];
                    charArray[j+1] = temp;
                }
            }
        }
        String descendingStr = new String(charArray);
        
        return descendingStr;
    }
   
}