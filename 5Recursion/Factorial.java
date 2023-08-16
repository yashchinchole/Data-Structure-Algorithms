import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        System.out.println("Factorial of " + n + " : " + factorial(n));
        sc.close();
    }

    private static long factorial(long n) {
        if (n == 0 || n == 1)
            return 1;
        else
            return n * factorial(n - 1);
    }
}
