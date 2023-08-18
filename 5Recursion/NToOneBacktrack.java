import java.util.Scanner;

public class NToOneBacktrack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        recursive(n, n);
        System.out.println();
        backTrack(1, n);
        sc.close();
    }

    private static void recursive(int i, int n) {
        if (i < 1)
            return;
        System.out.print(i);
        recursive(i - 1, n);
    }

    private static void backTrack(int i, int n) {
        if (i > n)
            return;
        backTrack(i + 1, n);
        System.out.print(i);
    }
}
