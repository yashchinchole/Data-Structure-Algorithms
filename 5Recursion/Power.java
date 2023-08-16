import java.math.BigInteger;
import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger a = sc.nextBigInteger();
        int b = sc.nextInt();
        System.out.println(power(a, b));
        sc.close();
    }

    private static BigInteger power(BigInteger a, int b) {
        BigInteger ans, finalAns;

        if (b == 1)
            return a;

        else {
            ans = power(a, b / 2);
            finalAns = ans.multiply(ans);
            if (b % 2 == 0)
                return finalAns;
            else
                return a.multiply(finalAns);
        }
    }
}
