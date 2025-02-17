class Solution {
    public int solution(int[] arr1, int[] arr2) {
        if (arr1.length > arr2.length) {
            return 1;
        } else if (arr1.length < arr2.length) {
            return -1;
        } else {
            int sum1 = 0, sum2 = 0;
            for (int num : arr1) {
                sum1 += num;
            }
            
            for (int num : arr2) {
                sum2 += num;
            }
            
            return Integer.compare(sum1, sum2);
        }
    }
}