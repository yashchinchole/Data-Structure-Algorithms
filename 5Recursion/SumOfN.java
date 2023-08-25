import java.util.Scanner;

public class SumOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumFunctional(n));
        sumParametrized(n, 0);
        sc.close();
    }

    private static long sumFunctional(int n) {
        if (n < 1)
            return 0;
        return n + sumFunctional(n - 1);
    }

    private static void sumParametrized(int n, int sum) {
        if (n < 1)
            System.out.println(sum);
        else
            sumParametrized(n - 1, sum + n);
    }
}
