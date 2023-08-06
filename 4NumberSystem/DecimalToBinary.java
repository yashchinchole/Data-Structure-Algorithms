import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Decimal : Binary");
        int num = sc.nextInt();
        System.out.println(+num + " : " + d2b1(num));
        System.out.println(num + " : " + d2b2(num));
        System.out.println(num + " : " + d2b3(num));
        d2b4(num);
        sc.close();
    }

    public static String d2b1(int num) {
        StringBuilder ans = new StringBuilder();
        while (num > 0) {
            int rem = num % 2;
            ans.append(rem);
            num /= 2;
        }
        return ans.reverse().toString();
    }

    public static String d2b2(int num) {
        StringBuilder ans = new StringBuilder();
        for (int i = 31; i >= 0; i--) {
            if (((num >> i) & 1) > 0)
                ans.append('1');
            else
                ans.append('0');
        }
        return ans.toString();
    }

    public static int d2b3(int num) {
        int ans = 0;
        int i = 0;
        while (num > 0) {
            int rem = num % 2;
            ans += (Math.pow(10, i++) * rem);
            num /= 2;
        }
        return ans;
    }

    public static void d2b4(int num) {
        int[] ans = new int[32];
        int i = 0;
        while (num > 0) {
            int rem = num % 2;
            ans[i++] = rem;
            num /= 2;
        }
        for (i = 31; i >= 0; i--)
            System.out.print(ans[i]);
    }
}