class Solution {
    public int solution(int[] nums) {
        //nums 배열에서 3개의 숫자를 뽑아서 만들수있는 수들의 배열을 만든다(nCr 크기의 배열 n = nums.lenght r = 3)
        //소수인지 판별하는 메서드를 만든다
        //새로만든 배열을 순회하며 소수판별 메서드를 통해서 소수인지 검증한뒤 맞다면 카운트를 증가시킨다
        int answer = 0;
        for (int i = 0; i < nums.length - 2; i++){
            for (int j = i+1; j < nums.length; j++){
                for (int k = j+1; k < nums.length; k++){
                    if(primeNumber(nums[i] + nums[j] + nums[k]))
                        answer ++;
                }
            }
        }
        
        return answer;
    }
    public static boolean primeNumber (int n) {
        int count = 0;

        for (int i = 1; i * i <= n; i++) {
            if (i*i == n) count ++;
            else if (n % i == 0) count += 2;
        }
        return count == 2 ? true : false;
    }
}