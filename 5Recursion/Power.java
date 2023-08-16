import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long b = sc.nextInt();
        System.out.println(power(a, b));
        sc.close();
    }

    private static long power(long a, long b) {
        long ans = 0, finalAns = 0;

        if (b == 1)
            return a;

        else {
            ans = power(a, b / 2);
            finalAns = ans * ans;
            if (b % 2 == 0)
                return finalAns;
            else
                return a * finalAns;
        }
    }
}
