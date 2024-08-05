class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        
        return isVaildString(cards1,cards2,goal);
    }
    public static String isVaildString(String[] arr1, String[] arr2, String[] arr3) {
        int i = 0;
        int j = 0;

        for (String s : arr3) {
            if (i < arr1.length && arr1[i].equals(s)) {
                i++;
            } else if (j < arr2.length && arr2[j].equals(s)) {
                j++;
            } else {
                return "No";
            }
        }

        return "Yes";
    }
}