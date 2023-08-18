import java.util.Scanner;

public class OneToNBacktrack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        recursive(1, n);
        System.out.println();
        backTrack(n, n);
        sc.close();
    }

    private static void recursive(int i, int n) {
        if (i > n)
            return;
        System.out.print(i);
        recursive(i + 1, n);
    }

    private static void backTrack(int i, int n) {
        if (i < 1)
            return;
        backTrack(i - 1, n);
        System.out.print(i);
    }
}
