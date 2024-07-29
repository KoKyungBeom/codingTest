import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        String star = "*";
        String str = star.repeat(a) + "\n";
        String answer = str.repeat(b);
        
        System.out.println(answer);
    }
}