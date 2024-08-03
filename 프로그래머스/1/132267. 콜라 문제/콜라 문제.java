class Solution {
    public int solution(int a, int b, int n) {
        return dfs(a,b,n,0);
    }
    public static int dfs (int a, int b, int n, int sum) {
        if (n < a) return sum;
        sum += (n / a) * b;

        n = (n / a) * b + (n % a);

        return dfs(a,b,n,sum);
    }
}