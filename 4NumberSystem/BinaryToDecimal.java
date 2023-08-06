import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextInt();
        System.out.println(num + " : " + b2d(num));
        sc.close();
    }

    public static long b2d(long num) {
        long ans = 0;
        int i = 0;
        while (num > 0) {
            int rem = (int) num % 10;
            ans += rem * Math.pow(2, i++);
            num /= 10;
        }
        return ans;
    }
}
